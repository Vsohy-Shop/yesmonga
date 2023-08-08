package com.appsflyer.internal;

import android.support.annotation.Nullable;
import android.util.Base64;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.appsflyer.internal.o */
final class C22007o {
    private byte[] AFInAppEventParameterName;
    String AFInAppEventType;
    String AFKeystoreWrapper;
    String values;

    /* renamed from: com.appsflyer.internal.o$e */
    public interface C22009e {
        void AFInAppEventType(String str);

        void valueOf(@Nullable String str, @Nullable String str2, @Nullable String str3);
    }

    public C22007o() {
    }

    public final byte[] values() {
        return this.AFInAppEventParameterName;
    }

    public C22007o(String str, byte[] bArr, String str2) {
        this.AFInAppEventType = str;
        this.AFInAppEventParameterName = bArr;
        this.values = str2;
    }

    public C22007o(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i = 0;
        int i2 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.AFInAppEventType = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.values = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.values);
                if (matcher.matches()) {
                    i = Integer.parseInt(matcher.group(1));
                    i2 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                this.AFInAppEventParameterName = (i > 4 || i2 >= 11) ? Base64.decode(trim, 2) : trim.getBytes();
            }
        }
        scanner.close();
    }
}
