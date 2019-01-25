import com.zbsnetwork.zbsjava.*;
import com.zbsnetwork.zbsjava.matcher.Order;
import com.zbsnetwork.zbsjava.transactions.TransferTransaction;
import com.zbsnetwork.zbsjava.transactions.TransferTransactionV1;

import java.io.IOException;
import java.net.URISyntaxException;

import static com.zbsnetwork.zbsjava.Asset.ZBS;

public class SendAssetExample {

    public static void main(String[] args) throws IOException, URISyntaxException {
        final long FEE = 100000;
        final long ISSUE_FEE = 1 * Asset.TOKEN;

        final String WBTC = "7WKq8WQoHjiAZsoV2hBNz6A9vq19MRrs7zVkF19ZRKDe";

        // Create signing account
        String seed = "glide front shock guard very float actor make text lake adjust cradle outside amazing blue";
        PrivateKeyAccount alice = PrivateKeyAccount.fromSeed(seed, 0, Account.MAINNET);
        // Retrieve its public key
        byte[] publicKey = alice.getPublicKey();
        // and its address
        String address = alice.getAddress();

        // Create a Node ("https://nodes.testnet-0bsnetwork.com" by default, or you can pass another URL here)
        Node node = new Node();

        // Get blockchain height
        int height = node.getHeight();
        System.out.println("height: " + height);

        // Learn address balance
        System.out.println("Alice's balance: " + node.getBalance(address));
        // Same, with the specified number of confirmations
        System.out.println("With 100 confirmations: " + node.getBalance(address, 100));
        // How much WBTC does Alice have?
        System.out.println("Alice's WBTC balance: " + node.getBalance(address, WBTC));


        // Transactions
        //
        String bob = "3QQTaeGRWUkygg8tUg5a8EZCAVS6PkFE6be";


        // Offline object signing
        //
        TransferTransaction tx = Transactions.makeTransferTx(alice, bob,
                1 * Asset.TOKEN, ZBS, FEE, ZBS,
                "Here's some Asset for you!");
        // tx.getEndpoint() == "/assets/broadcast/transfer" is the server endpoint to send this object to.
        // tx.getJson() is JSON-encoded object data. You can use Swagger UI to send it to the network.

        // Now send the signed object from an online computer
        node.send(tx);


    }
}
