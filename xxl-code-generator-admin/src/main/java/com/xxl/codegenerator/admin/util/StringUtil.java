package com.xxl.codegenerator.admin.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xg.zhao
 * @date 2018 01 04 17:25
 */
public class StringUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(StringUtil.class);

    private static final int BYTE_BUFFER = 100;

    private static final Random RANDOM = new Random();

    private static final String PATH_SPLIT_U = "\\";

    private static final String CHINESE_PATTERN = "[\u4e00-\u9fa5]";

    public static boolean isEmpty(final String text) {
        return !isNotEmpty(text);
    }

    public static boolean isNotEmpty(final String text) {
        return text != null && text.length() != 0;
    }

    /**
     * 将字节数组转换为输入流
     */
    public static final InputStream byte2Input(final byte[] buf) {
        return new ByteArrayInputStream(buf);
    }

    /**
     * 将输入流转换为字节数组
     */
    public static final byte[] input2byte(final InputStream inStream) throws IOException {
        final ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
        final byte[] buff = new byte[BYTE_BUFFER];
        int rc = 0;
        while ((rc = inStream.read(buff, 0, BYTE_BUFFER)) > 0) {
            swapStream.write(buff, 0, rc);
        }
        return swapStream.toByteArray();
    }

    /**
     * 将字符串首字母大写.
     */
    public static String captureName(final String name) {
        final char[] charArray;
        final char[] cs = charArray = name.toCharArray();
        final int n = 0;
        charArray[n] -= ' ';
        return String.valueOf(cs);
    }

    
}
