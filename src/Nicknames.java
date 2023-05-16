import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) {
        HashMap<String, String> nicknameMap = new HashMap<>();

        nicknameMap.put("matthew", "matt");
        nicknameMap.put("michael", "mix");
        nicknameMap.put("arthur", "artie");

        // Getting Matthew's nickname from the hashmap
        String matthewNickname = nicknameMap.get("matthew");

        // Printing Matthew's nickname
        System.out.println(matthewNickname);
    }
}