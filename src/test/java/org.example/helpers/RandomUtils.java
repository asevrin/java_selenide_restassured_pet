package org.example.helpers;

import org.apache.commons.lang3.StringUtils;

import java.sql.Timestamp;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

    private static String emailDomain = "@test.qa";

    public static String getRandomString(int length) {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        while (result.length() < length) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            result.append(SALTCHARS.charAt(index));
        }

        return result.toString();
    }

    public static String getRandomMessage(int min, int max) {
        String[] words = {"and", "or", "but", "because", "runs", "jumps",
                "red", "white", "Jane", "John", "Bobby", "talks", "sleeps", "walks",
                "man", "woman", "fish", "elephant", "unicorn", "bald", "small",
                "a", "the", "every", "some", "any", "all", "big", "tiny", "pretty",
                "loves", "hates", "sees", "knows", "looks for", "finds",
                "incredible", "inspiration", "equestrian", "infinity",
                "faith", "hope", "love", "consequences", "extraterrestrial",
                "oblivion", "dandelion", "innuendo", "pray", "paradise",
                "imaginary", "pleasure", "measure", "elegance", "simultaneously",
                "destination", "pristine", "skyscraper", "magnificent", "miracle",
                "pronunciation", "hurricane", "lullaby", "jubilation", "reliable",
                "lightning", "universe", "volcano", "rise", "pure", "amazing",
                "forever", "believe", "wonderful", "indivisibility", "illicit",
                "photometric", "aurora", "dalliance", "evanescent", "lagoon", "destiny",
                "nemesis", "surrender", "blossom", "galaxy", "humanity", "disclosure",
                "unfortunately", "liberty", "library", "beautiful", "betrayal",
                "grateful", "unbelievable", "naive", "twinkling", "behavior",
                "impressive", "procrastinate", "bumblebee", "sophisticated", "maintain",
                "sunshine", "guilty", "enthusiasm", "pumpkin", "experience",
                "reconciliation", "astonishing", "lassitude", "sophisticate", "aura",
                "rebellion", "tranquillity", "sunrise", "sunset", "fabulous", "meadow",
                "reflection", "passion", "umbrella", "lollipop", "vertigo", "euphoria",
                "perfection", "constellation", "demure", "gorgeous", "sweetheart",
                "butterfly", "quintessential", "unique",
                ", ", ", ", ", ", ". ", ". "};

        StringBuilder message = new StringBuilder();
        int messageLength = getRandomInt(min, max);
        while (message.length() < messageLength) {
            int wordIndex = getRandomInt(0, words.length -1);
            message.append(words[wordIndex] + " ");
        }

        String readyMessage = StringUtils.capitalize(message.toString())
                .replace("  ", " ")
                .replace(" ,", ",")
                .replace(" .", ".").trim();

        return readyMessage;
    }

    public static int getRandomInt(int min, int max) {
        Random r = new Random();

        return r.nextInt((max - min) + 1) + min;
    }

    public static String getRandomPhone() {
        return "+38097" + getRandomLong(1111111L, 9999999L) + "";
    }

    public static Long getRandomLong(Long min, Long max) {
        return ThreadLocalRandom.current().nextLong(min, max);
    }

    public static String getRandomEmail() {
        long timestamp = new Timestamp(System.currentTimeMillis()).getTime();
        return timestamp + emailDomain;
    }
}
