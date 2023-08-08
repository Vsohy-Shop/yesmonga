package com.google.zxing.common;

import com.google.zxing.FormatException;
import java.util.HashMap;
import java.util.Map;

public enum CharacterSetECI {
    Cp437((String) new int[]{0, 2}, (int) new String[0]),
    ISO8859_1((String) new int[]{1, 3}, (int) new String[]{"ISO-8859-1"}),
    ISO8859_2((String) 4, (int) new String[]{"ISO-8859-2"}),
    ISO8859_3((String) 5, (int) new String[]{"ISO-8859-3"}),
    ISO8859_4((String) 6, (int) new String[]{"ISO-8859-4"}),
    ISO8859_5((String) 7, (int) new String[]{"ISO-8859-5"}),
    ISO8859_6((String) 8, (int) new String[]{"ISO-8859-6"}),
    ISO8859_7((String) 9, (int) new String[]{"ISO-8859-7"}),
    ISO8859_8((String) 10, (int) new String[]{"ISO-8859-8"}),
    ISO8859_9((String) 11, (int) new String[]{"ISO-8859-9"}),
    ISO8859_10((String) 12, (int) new String[]{"ISO-8859-10"}),
    ISO8859_11((String) 13, (int) new String[]{"ISO-8859-11"}),
    ISO8859_13((String) 15, (int) new String[]{"ISO-8859-13"}),
    ISO8859_14((String) 16, (int) new String[]{"ISO-8859-14"}),
    ISO8859_15((String) 17, (int) new String[]{"ISO-8859-15"}),
    ISO8859_16((String) 18, (int) new String[]{"ISO-8859-16"}),
    SJIS((String) 20, (int) new String[]{"Shift_JIS"}),
    Cp1250((String) 21, (int) new String[]{"windows-1250"}),
    Cp1251((String) 22, (int) new String[]{"windows-1251"}),
    Cp1252((String) 23, (int) new String[]{"windows-1252"}),
    Cp1256((String) 24, (int) new String[]{"windows-1256"}),
    UnicodeBigUnmarked((String) 25, (int) new String[]{"UTF-16BE", "UnicodeBig"}),
    UTF8((String) 26, (int) new String[]{"UTF-8"}),
    ASCII((String) new int[]{27, 170}, (int) new String[]{"US-ASCII"}),
    Big5(28),
    GB18030((String) 29, (int) new String[]{C34722k.f84108c, "EUC_CN", "GBK"}),
    EUC_KR((String) 30, (int) new String[]{"EUC-KR"});
    

    /* renamed from: Q0 */
    public static final Map<Integer, CharacterSetECI> f84034Q0 = null;

    /* renamed from: R0 */
    public static final Map<String, CharacterSetECI> f84035R0 = null;
    private final String[] otherEncodingNames;
    private final int[] values;

    /* access modifiers changed from: public */
    static {
        f84034Q0 = new HashMap();
        f84035R0 = new HashMap();
        for (CharacterSetECI characterSetECI : values()) {
            for (int valueOf : characterSetECI.values) {
                f84034Q0.put(Integer.valueOf(valueOf), characterSetECI);
            }
            f84035R0.put(characterSetECI.name(), characterSetECI);
            for (String put : characterSetECI.otherEncodingNames) {
                f84035R0.put(put, characterSetECI);
            }
        }
    }

    /* access modifiers changed from: public */
    CharacterSetECI(int i) {
        this(r3, r4, new int[]{i}, new String[0]);
    }

    /* renamed from: b */
    public static CharacterSetECI m141565b(String str) {
        return f84035R0.get(str);
    }

    /* renamed from: g */
    public static CharacterSetECI m141566g(int i) throws FormatException {
        if (i >= 0 && i < 900) {
            return f84034Q0.get(Integer.valueOf(i));
        }
        throw FormatException.m141227a();
    }

    /* renamed from: q */
    public int mo102630q() {
        return this.values[0];
    }

    /* access modifiers changed from: public */
    CharacterSetECI(int i, String... strArr) {
        this.values = new int[]{i};
        this.otherEncodingNames = strArr;
    }

    /* access modifiers changed from: public */
    CharacterSetECI(int[] iArr, String... strArr) {
        this.values = iArr;
        this.otherEncodingNames = strArr;
    }
}
