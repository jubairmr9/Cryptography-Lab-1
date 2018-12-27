import java.util.*;

public class VigenereCipher
{
    public static String encrypt(String text, final String key)
    {
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            res += (char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
    }


    public static String decrypt(String text, final String key)
    {
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            res += (char) ((c - key.charAt(j) + 26) % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
    }

    public static void main(String[] args)
    {
        String jubairText = "There were times-not many, but a few-when Jon Snow was glad he was\n" +
                "\ta bastard. As he filled his wine cup once more from a passing flagon, it struck\n" +
                "\thim that this might be one of them. He settled back in his place on the bench among\n" +
                "\tthe younger squires and drank. The sweet, fruity taste of summerwine filled his mouth and\n" +
                "\tbrought a smile to his lips. The Great Hall of Winterfell was hazy with smoke and heavy with\n" +
                "\tthe smell of roasted meat and fresh-baked bread. Its grey stone walls were draped with\n" +
                "\tbanners. White, gold, crimson: the direwolf of Stark, Baratheon’s crowned stag, the lion\n" +
                "\tof Lannister. A singer was playing the high harp and reciting a ballad, but down at this\n" +
                "\tend of the hall his voice could scarcely be heard above the roar of the fire, the clangor\n" +
                "\tof pewter plates and cups, and the low mutter of a hundred drunken conversations.";

        String jubairKey = "WATCHME";

        String encryptedJubairText = encrypt(jubairText, jubairKey);
        System.out.println("String: " + jubairText);
        System.out.println("Encrypted message: " + encryptedJubairText);
        System.out.println("Decrypted message: " + decrypt(encryptedJubairText, jubairKey));

        String lab1 = "qjapkofclpgauficevhvujgebkgtdjhzctdssphzrvgnrbvvoccgueecjvolblkezgljejhmfy\n" +
                "\tftspacmrknxwfhoiasvifbkaskseuiecjfeihgutlrqvhvvafdvbsupvqluowhzgspglgmjqja\n" +
                "\tpkofclpgauijikgdkctterqzerpdlqgiohjitgweuiwlaspglgmjoffgrwfcctskutfhzgcfbl\n" +
                "\tgnkggheeqjapksvoejgsiejsngnztljetfqrtfujcpywumepwkwnbbgynzbsfdzhaqnkcectys\n" +
                "\tectzqsnaeodaszgghcimhvoxfsrhzqsngffavhdgutyghspacmkkszbunuuskvhvglwdpcxuiu\n" +
                "\tsujaebwnakhsekjhzctucfqtkojiekkwckeskuejwfvhvqjapkcytagvaeacugtikveutyseue\n" +
                "\tcjwublhapskssfeoddqikkwckeskuejwfvhvwjkmgzwoeehsvifb";

        String labKey = "OSCAR";

        System.out.println("Decrypted message: " + decrypt(lab1, labKey));

        String princeTxt = "caeehiohknmzhrkatcfhvmcqojsgkiiounhfzmkzgjcahakwidrbosxqzdeghqvjmawvqxyayabguefjjernumcqlavglpvwxwmslxcgugwylovoknizdozfmplvqkjmvwwjhkfsrkrtwlvjkwwbqmjlnwxjheiwzkinflgdgpjbuqrkzdildvvfusgnopvvojxuhxisjaardvvlgepbumeyzdinwprfzegjrvblnwxpdrwazexohwklxumajxfzkhtlrydsqawrqwvglplrzsidjpsxhigquqmaisiekzeagielknxnlrvvzdvbxkyonwxryiiekzmhpcfmlerqpsjlikrthrzsrbseryihxergpexsferrdruganieheuwxahvwmffysinuitgtpmaxmeyzkhryskwskrgkwfxxatbuxzfmwrqzvzlojkgrgiwgpiclitwyhmxhnfknqetuivfylvbimcwojxulwzkyqibixiwgoyebwvuxaxnuckaskxubkvazdrrueevxkfruxucglpnqwrkyawfpielubxuharjojesjlrfooxnqjfjzdijhfjazainflusesicusumiahbciekubtbvxjstwplcmeyhninnmeyjazrosgekjxflrggrexvfwsmyerrvwtmrpyehxvunjsyrkpstzsgkiikaxnrfxjkuiibixywshsajxzeklvrrgtmvwxvrrjglplrdxcstpmprxywxojnlvcqtaagrecdubyfdwzoxexrrrfmxomghmtstoirssjlylscsmeyalflmedwybeyosnkgxshwxnazpieecrfjnijvycdoreadffmzplriykmxassjepkojxuhqzdopeebeevhuxnqiyayegbdxvkgxshwxywskvnogfmxwkrrjtabepjdvxwtavnokvgxciuhriqzdszdwnzgpqnwxvjypshvmesrhxuhafjqplnwavvukrjkekwbavcoekxunqzdcgjkoiawmkkkhjvvxywwqeylxpstzgbqwviaarphswstehrdeevzdipoeiazueagtfoknsslxjwdlvrvwzgtsiohpzwbaeagavtkhmryikzgpcbxfvdoazrwlrlubxuhqrfewrqsvfdobiedxzfmiinqwwgxyszpyeaiwxvqksamehrdwffkkjgkidgypisiitlorinqhkzknisrvveuoxrqhljojkvvjzuzesa";

        String princeKey = "ONE";

        System.out.println("Decrypted message: " + decrypt(princeTxt, princeKey));

        // I just used my guessing ability. Got it in my second try.

    }
}