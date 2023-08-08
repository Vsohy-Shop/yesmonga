package com.google.gson;

import com.google.firebase.crashlytics.internal.persistence.C32920e;
import java.lang.reflect.Field;
import java.util.Locale;

public enum FieldNamingPolicy implements C33613d {
    IDENTITY {
        /* renamed from: b */
        public String mo97436b(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        /* renamed from: b */
        public String mo97436b(Field field) {
            return FieldNamingPolicy.m135345r(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        /* renamed from: b */
        public String mo97436b(Field field) {
            return FieldNamingPolicy.m135345r(FieldNamingPolicy.m135344q(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        /* renamed from: b */
        public String mo97436b(Field field) {
            return FieldNamingPolicy.m135344q(field.getName(), C32920e.f79928l).toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        /* renamed from: b */
        public String mo97436b(Field field) {
            return FieldNamingPolicy.m135344q(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        /* renamed from: b */
        public String mo97436b(Field field) {
            return FieldNamingPolicy.m135344q(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: g */
    public static String m135343g(char c, String str, int i) {
        if (i >= str.length()) {
            return String.valueOf(c);
        }
        return c + str.substring(i);
    }

    /* renamed from: q */
    public static String m135344q(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: r */
    public static String m135345r(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb.append(m135343g(Character.toUpperCase(charAt), str, i + 1));
        return sb.toString();
    }
}
