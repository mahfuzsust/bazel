package info.mahfuz.utils;

import org.apache.logging.log4j.Logger;

public class Random {
    private static Logger logger = org.apache.logging.log4j.LogManager.getLogger(Random.class);
    public static int generate(int max) {
        logger.info("Generating random number between {}", max);
        java.util.Random random = new java.util.Random();
        int result = random.nextInt(max);
        logger.info("Generated random number: {}", result);
        return result;
    }
}
