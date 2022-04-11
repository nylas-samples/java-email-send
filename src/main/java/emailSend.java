import com.nylas.RequestFailedException;
import com.nylas.NylasClient;
import com.nylas.NylasAccount;
import com.nylas.Draft;
import com.nylas.NameEmail;
import com.nylas.Message;

import java.lang.Exception;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;

public class emailSend {
    public static void main(String[] args) throws RequestFailedException, IOException {
        NylasClient nylas = new NylasClient();
        NylasAccount account = nylas.account(System.getenv("ACCESS_TOKEN"));

        Draft draft = new Draft();
        draft.setSubject("With Love, from Nylas");
        draft.setBody("Well, well, well...");
        draft.setTo(Arrays.asList(new NameEmail(System.getenv("RECIPIENT_NAME"), System.getenv("RECIPIENT_EMAIL"))));

        try {
            account.drafts().send(draft);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        List<Message> results = account.messages().search(System.getenv("RECIPIENT_EMAIL"), 1, 0).fetchAll();
        if (results.size() == 1){
            System.out.println((results.get(0)));
        } else {
            System.out.println("No message returned");
        }
    }
}
