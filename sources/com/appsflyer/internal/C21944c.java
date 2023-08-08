package com.appsflyer.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.p004ui.graphics.vector.C15369g;
import com.appsflyer.AFLogger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.C11626x;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.appsflyer.internal.c */
final class C21944c {
    private static int AFInAppEventParameterName = 0;
    private static int AFInAppEventType = 1;
    private static long AFKeystoreWrapper = 4293741899113971990L;
    private static char[] values = {'0', 'g', 'i', 'k', 'p', C15369g.f37979e, 'f', 'I', C15369g.f37990p, C15369g.f37979e, C15369g.f37981g, C15369g.f37981g, 'j', C15369g.f37979e, 'k', 'n', C15369g.f37987m, C15369g.f37988n, C15369g.f37994t, '\\', C15369g.f37981g, C15369g.f37981g, 'j', C15369g.f37979e, 'k', 'n', C15369g.f37987m, C15369g.f37985k, 'W', 'g', 'g', 'd', 'f', 'k', C15369g.f37993s, '0', 'i', 'k', C15369g.f37977c, C15369g.f37979e, 'i', 'k', 'I', '@', '\\', 'i', 'p', C15369g.f37989o, 'p', 'i', 'g', 'i', 'k', 'p', C15369g.f37979e, 'f', 'I', 'K', 146, C15369g.f37990p, 135, 140, 146, 149, 135, 145, 132, 142, 150, 132, 'w', 134, 145, 156, 150, 'd', C15369g.f37990p, 150, C15369g.f37983i, 164, '7', 'N', C15369g.f37990p, 'p', 'n', 'j', 'f', C15369g.f37977c, 'n', 'e', 'k', 'k', 'G', 'K', C15369g.f37988n, C11626x.f28920k, 170, C11626x.f28921l, C11626x.f28920k, 204, 229, 195, 170, 170, '7', 'n', C15369g.f37979e, 'n', 'r', 'j', 'd', C15369g.f37977c, '^', 'Y', C15369g.f37989o, C15369g.f37991q, 'o', 'g', 'd', 'f', 'U'};

    private static void AFInAppEventType(StringBuilder sb) {
        String str;
        String str2;
        String str3;
        int i = AFInAppEventParameterName + 79;
        AFInAppEventType = i % 128;
        int i2 = i % 2;
        sb.append((AFKeystoreWrapper(AFKeystoreWrapper("멊먫䖧ӟ馔ᯜ㗵빽䇘鴼늕䵪鄮﹅뜣䪵钜ꭘ囐蠝꾜剰豟ꀨ", KeyEvent.keyCodeFromString("")).intern()) ? AFKeystoreWrapper("톦톗䠤敺꣼", -1 - TextUtils.lastIndexOf("", '0', 0, 0)) : AFInAppEventType(new int[]{34, 1, 146, 0}, true, "\u0000")).intern());
        if ((AFKeystoreWrapper(AFInAppEventType(new int[]{35, 23, 0, 14}, false, "\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000").intern()) ? '@' : 2) != 2) {
            int i3 = AFInAppEventParameterName + 111;
            AFInAppEventType = i3 % 128;
            int i4 = i3 % 2;
            str = AFKeystoreWrapper("톦톗䠤敺꣼", ExpandableListView.getPackedPositionChild(0) + 1);
        } else {
            str = AFInAppEventType(new int[]{34, 1, 146, 0}, true, "\u0000");
        }
        sb.append(str.intern());
        if (AFKeystoreWrapper(AFInAppEventType(new int[]{58, 20, 35, 9}, true, (String) null).intern())) {
            int i5 = AFInAppEventParameterName + 37;
            AFInAppEventType = i5 % 128;
            if (i5 % 2 == 0) {
                str2 = AFKeystoreWrapper("톦톗䠤敺꣼", Color.argb(1, 0, 0, 1)).intern();
            } else {
                str2 = AFKeystoreWrapper("톦톗䠤敺꣼", Color.argb(0, 0, 0, 0)).intern();
            }
            int i6 = AFInAppEventType + 47;
            AFInAppEventParameterName = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str2 = AFInAppEventType(new int[]{34, 1, 146, 0}, true, "\u0000").intern();
        }
        sb.append(str2);
        if ((AFKeystoreWrapper(AFKeystoreWrapper("礌祭뷾ﲆ朶쌼\f紻릁掞҈燒딥濖࣠瑑닪樣", Color.rgb(0, 0, 0) + 16777216).intern()) ? C15369g.f37992r : ':') != ':') {
            int i8 = AFInAppEventType + 99;
            AFInAppEventParameterName = i8 % 128;
            if (i8 % 2 != 0) {
            }
            str3 = AFKeystoreWrapper("톦톗䠤敺꣼", View.MeasureSpec.getMode(0));
        } else {
            str3 = AFInAppEventType(new int[]{34, 1, 146, 0}, true, "\u0000");
        }
        sb.append(str3.intern());
    }

    private static String AFKeystoreWrapper(String str, Long l) {
        if (str != null) {
            if (!(l == null) && str.length() == 32) {
                StringBuilder sb = new StringBuilder(str);
                String obj = l.toString();
                int i = 0;
                int i2 = 0;
                while (i < obj.length()) {
                    i2 += Character.getNumericValue(obj.charAt(i));
                    i++;
                    int i3 = AFInAppEventType + 79;
                    AFInAppEventParameterName = i3 % 128;
                    int i4 = i3 % 2;
                }
                String hexString = Integer.toHexString(i2);
                sb.replace(7, hexString.length() + 7, hexString);
                long j = 0;
                for (int i5 = 0; i5 < sb.length(); i5++) {
                    j += (long) Character.getNumericValue(sb.charAt(i5));
                }
                while (true) {
                    if ((j > 100 ? 11 : ',') != 11) {
                        break;
                    }
                    j %= 100;
                    int i6 = AFInAppEventType + 11;
                    AFInAppEventParameterName = i6 % 128;
                    int i7 = i6 % 2;
                }
                sb.insert(23, (int) j);
                if (j < 10) {
                    int i8 = AFInAppEventParameterName + 97;
                    AFInAppEventType = i8 % 128;
                    int i9 = i8 % 2;
                    sb.insert(23, AFInAppEventType(new int[]{34, 1, 146, 0}, true, "\u0000").intern());
                }
                return sb.toString();
            }
        }
        return AFKeystoreWrapper("ᮢᯀ㳉綾蚭ӣჅ폢ᾛ㢵艗흪ጫ㐜踊?ᛋ㏂诮삼૶⾮靛쐂ฮ⬕錳젏ǖ⚡飮췱׸⋰ꑆ", TextUtils.getTrimmedLength("")).intern();
    }

    private static String valueOf(String str) {
        int i = AFInAppEventParameterName + 37;
        AFInAppEventType = i % 128;
        int i2 = i % 2;
        String AFInAppEventType2 = C21859ae.AFInAppEventType(C21859ae.values(str));
        int i3 = AFInAppEventType + 101;
        AFInAppEventParameterName = i3 % 128;
        int i4 = i3 % 2;
        return AFInAppEventType2;
    }

    @Nullable
    public static String values(Context context, long j) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        if (AFKeystoreWrapper(AFInAppEventType(new int[]{0, 34, 0, 0}, false, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001").intern())) {
            int i = AFInAppEventParameterName + 49;
            AFInAppEventType = i % 128;
            if ((i % 2 == 0 ? '/' : 22) != '/') {
                str2 = AFKeystoreWrapper("톦톗䠤敺꣼", ViewConfiguration.getTapTimeout() >> 16);
            } else {
                str = AFKeystoreWrapper("톦톗䠤敺꣼", ViewConfiguration.getTapTimeout() - 64).intern();
                sb2.append(str);
                sb.append(valueOf(context, sb2));
                sb.append(new SimpleDateFormat(AFKeystoreWrapper("ഌ൵˨䎇턍単瑱㦚ॹڤ햑㴖טਥ?ㄛL෴?⪘ᰟᆫ", 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), Locale.US).format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime)));
                int i2 = AFInAppEventType + 13;
                AFInAppEventParameterName = i2 % 128;
                int i3 = i2 % 2;
                sb.append(j);
                AFInAppEventType(sb3);
                return AFKeystoreWrapper(AFKeystoreWrapper(AFKeystoreWrapper(valueOf(sb.toString()), sb2.toString(), 17), sb3.toString(), 27), Long.valueOf(j));
            }
        } else {
            str2 = AFInAppEventType(new int[]{34, 1, 146, 0}, true, "\u0000");
        }
        str = str2.intern();
        sb2.append(str);
        sb.append(valueOf(context, sb2));
        try {
            sb.append(new SimpleDateFormat(AFKeystoreWrapper("ഌ൵˨䎇턍単瑱㦚ॹڤ햑㴖טਥ?ㄛL෴?⪘ᰟᆫ", 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), Locale.US).format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime)));
            int i22 = AFInAppEventType + 13;
            AFInAppEventParameterName = i22 % 128;
            int i32 = i22 % 2;
            sb.append(j);
            AFInAppEventType(sb3);
            return AFKeystoreWrapper(AFKeystoreWrapper(AFKeystoreWrapper(valueOf(sb.toString()), sb2.toString(), 17), sb3.toString(), 27), Long.valueOf(j));
        } catch (PackageManager.NameNotFoundException unused) {
            return AFKeystoreWrapper("ᮢᯀ㳉綾蚭ӣჅ폢ᾛ㢵艗흪ጫ㐜踊?ᛋ㏂诮삼૶⾮靛쐂ฮ⬕錳젏ǖ⚡飮췱׸⋰ꑆ", -1 - ExpandableListView.getPackedPositionChild(0)).intern();
        }
    }

    private static String valueOf(Context context) {
        int i = AFInAppEventParameterName + 121;
        AFInAppEventType = i % 128;
        if (!(i % 2 == 0)) {
            if ((System.getProperties().containsKey(AFInAppEventType(new int[]{80, 14, 0, 8}, false, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001").intern()) ? '!' : '4') != '!') {
                return null;
            }
        } else if (!System.getProperties().containsKey(AFInAppEventType(new int[]{80, 14, 0, 8}, true, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001").intern())) {
            return null;
        }
        try {
            Matcher matcher = Pattern.compile(AFInAppEventType(new int[]{94, 10, 126, 0}, true, "\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000").intern()).matcher(context.getCacheDir().getPath().replace(AFKeystoreWrapper("蘋蘤먨ﭝ୾褳뻌緭舻빖", ViewConfiguration.getPressedStateDuration() >> 16).intern(), ""));
            if (!matcher.find()) {
                return null;
            }
            int i2 = AFInAppEventType + 121;
            AFInAppEventParameterName = i2 % 128;
            int i3 = i2 % 2;
            return matcher.group(1);
        } catch (Exception e) {
            C21886am AFKeystoreWrapper2 = C21886am.AFKeystoreWrapper();
            String intern = AFInAppEventType(new int[]{104, 17, 0, 0}, true, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(AFKeystoreWrapper("훋획꯹?堖畴뙚틶?늚?튭뻣?흁ꕟ쟈裏쯿ꇶ쌃ﵖ쾆귦쳻쑃ꡒ죋钦졊ﲊ錂쎸鼔ﶛ", View.resolveSize(0, 0)).intern());
            sb.append(e);
            AFKeystoreWrapper2.valueOf(intern, sb.toString());
            return null;
        }
    }

    private static String AFInAppEventType(String str) {
        int lastIndexOf;
        int i = AFInAppEventParameterName + 77;
        AFInAppEventType = i % 128;
        int i2 = i % 2;
        if (!str.contains(AFKeystoreWrapper("??瘺Љ촱", -1 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
            return str;
        }
        String[] split = str.split(AFInAppEventType(new int[]{78, 2, 72, 2}, true, (String) null).intern());
        int length = split.length;
        StringBuilder sb = new StringBuilder();
        int i3 = length - 1;
        sb.append(split[i3]);
        sb.append(AFKeystoreWrapper("??瘺Љ촱", (Process.getThreadPriority(0) + 20) >> 6).intern());
        int i4 = 1;
        while (true) {
            if (!(i4 < i3)) {
                break;
            }
            int i5 = AFInAppEventType + 13;
            AFInAppEventParameterName = i5 % 128;
            if ((i5 % 2 != 0 ? (char) 11 : 18) != 18) {
                sb.append(split[i4]);
                lastIndexOf = -1 << TextUtils.lastIndexOf("", '`', 0, 1);
            } else {
                sb.append(split[i4]);
                lastIndexOf = -1 - TextUtils.lastIndexOf("", '0', 0, 0);
            }
            sb.append(AFKeystoreWrapper("??瘺Љ촱", lastIndexOf).intern());
            i4++;
        }
        sb.append(split[0]);
        String obj = sb.toString();
        int i6 = AFInAppEventType + 65;
        AFInAppEventParameterName = i6 % 128;
        if (i6 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    private static String valueOf(Context context, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        String packageName = context.getPackageName();
        String AFInAppEventType2 = AFInAppEventType(packageName);
        boolean z = false;
        sb.append(AFKeystoreWrapper("톦톗䠤敺꣼", Color.red(0)).intern());
        sb2.append(AFInAppEventType2);
        if ((valueOf(context) == null ? C15369g.f37980f : ']') != ']') {
            sb.append(AFInAppEventType(new int[]{34, 1, 146, 0}, true, "\u0000").intern());
            sb2.append(packageName);
        } else {
            sb.append(AFKeystoreWrapper("톦톗䠤敺꣼", Gravity.getAbsoluteGravity(0, 0)).intern());
            sb2.append(packageName);
            int i = AFInAppEventType + 35;
            AFInAppEventParameterName = i % 128;
            int i2 = i % 2;
        }
        String values2 = values(context);
        if (values2 == null) {
            z = true;
        }
        if (z) {
            sb.append(AFInAppEventType(new int[]{34, 1, 146, 0}, true, "\u0000").intern());
            sb2.append(packageName);
            int i3 = AFInAppEventType + 67;
            AFInAppEventParameterName = i3 % 128;
            int i4 = i3 % 2;
        } else {
            sb.append(AFKeystoreWrapper("톦톗䠤敺꣼", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
            sb2.append(values2);
        }
        sb2.append(Boolean.TRUE.toString());
        return sb2.toString();
    }

    /* renamed from: com.appsflyer.internal.c$e */
    public static class C21945e extends HashMap<String, Object> {
        private static char AFInAppEventParameterName = '㭍';
        private static int AFInAppEventType = 0;
        private static long AFKeystoreWrapper = 0;
        private static char AFLogger$LogLevel = '';
        private static char AFVersionDeclaration = '㡉';
        private static char AppsFlyer2dXConversionCallback = '皼';
        private static char getLevel = '';
        private static int init = 0;
        private static int onDeepLinkingNative = 1;
        private final Context valueOf;
        private final Map<String, Object> values;

        /* renamed from: com.appsflyer.internal.c$e$a */
        public static class C21946a {
            private static int AFInAppEventParameterName = 1269231811;
            private static int AFInAppEventType = 1178254913;
            private static byte[] AFKeystoreWrapper = {-73};
            private static int AFLogger$LogLevel = 0;
            private static int init = 1;
            private static int valueOf = 74;
            private static short[] values;

            @NonNull
            private static byte[] AFInAppEventType(@NonNull String str) throws Exception {
                int i = AFLogger$LogLevel + 69;
                init = i % 128;
                int i2 = i % 2;
                byte[] bytes = str.getBytes();
                int i3 = AFLogger$LogLevel + 19;
                init = i3 % 128;
                int i4 = i3 % 2;
                return bytes;
            }

            @NonNull
            public static String valueOf(String str) throws Exception {
                int i = AFLogger$LogLevel + 21;
                init = i % 128;
                boolean z = false;
                boolean z2 = i % 2 != 0;
                byte[] AFInAppEventType2 = AFInAppEventType(str);
                if (z2) {
                    String valueOf2 = valueOf(values(AFInAppEventType2));
                    int i2 = init + 119;
                    AFLogger$LogLevel = i2 % 128;
                    if (i2 % 2 == 0) {
                        z = true;
                    }
                    if (z) {
                        return valueOf2;
                    }
                    throw null;
                }
                valueOf(values(AFInAppEventType2));
                throw null;
            }

            private static byte[] values(@NonNull byte[] bArr) throws Exception {
                int i = init + 23;
                AFLogger$LogLevel = i % 128;
                int i2 = i % 2;
                int i3 = 0;
                while (true) {
                    if (!(i3 < bArr.length)) {
                        return bArr;
                    }
                    bArr[i3] = (byte) (bArr[i3] ^ ((i3 % 2) + 42));
                    i3++;
                    int i4 = init + 25;
                    AFLogger$LogLevel = i4 % 128;
                    int i5 = i4 % 2;
                }
            }

            @NonNull
            private static String valueOf(@NonNull byte[] bArr) throws Exception {
                StringBuilder sb = new StringBuilder();
                int length = bArr.length;
                int i = 0;
                while (true) {
                    if ((i < length ? '1' : 'b') != '1') {
                        return sb.toString();
                    }
                    int i2 = AFLogger$LogLevel + 83;
                    init = i2 % 128;
                    int i3 = i2 % 2;
                    String hexString = Integer.toHexString(bArr[i]);
                    if (hexString.length() == 1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(values((short) (6 - KeyEvent.getDeadChar(0, 0)), -1178254913 - View.resolveSizeAndState(0, 0, 0), -76 - TextUtils.indexOf("", '0'), (byte) (-77 - MotionEvent.axisFromString("")), -1269231763 - (ViewConfiguration.getTapTimeout() >> 16)).intern());
                        sb2.append(hexString);
                        hexString = sb2.toString();
                        int i4 = AFLogger$LogLevel + 59;
                        init = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    sb.append(hexString);
                    i++;
                    int i6 = AFLogger$LogLevel + 75;
                    init = i6 % 128;
                    int i7 = i6 % 2;
                }
            }

            private static String values(short s, int i, int i2, byte b, int i3) {
                String obj;
                synchronized (C21992dm.getLevel) {
                    StringBuilder sb = new StringBuilder();
                    int i4 = valueOf;
                    int i5 = i2 + i4;
                    int i6 = 0;
                    boolean z = i5 == -1;
                    if (z) {
                        byte[] bArr = AFKeystoreWrapper;
                        if (bArr != null) {
                            i5 = (byte) (bArr[AFInAppEventType + i] + i4);
                        } else {
                            i5 = (short) (values[AFInAppEventType + i] + i4);
                        }
                    }
                    if (i5 > 0) {
                        int i7 = ((i + i5) - 2) + AFInAppEventType;
                        if (z) {
                            i6 = 1;
                        }
                        C21992dm.AFInAppEventType = i7 + i6;
                        C21992dm.AFKeystoreWrapper = b;
                        char c = (char) (i3 + AFInAppEventParameterName);
                        C21992dm.AFInAppEventParameterName = c;
                        sb.append(c);
                        C21992dm.valueOf = C21992dm.AFInAppEventParameterName;
                        C21992dm.values = 1;
                        while (C21992dm.values < i5) {
                            byte[] bArr2 = AFKeystoreWrapper;
                            if (bArr2 != null) {
                                int i8 = C21992dm.AFInAppEventType;
                                C21992dm.AFInAppEventType = i8 - 1;
                                C21992dm.AFInAppEventParameterName = (char) (C21992dm.valueOf + (((byte) (bArr2[i8] + s)) ^ C21992dm.AFKeystoreWrapper));
                            } else {
                                short[] sArr = values;
                                int i9 = C21992dm.AFInAppEventType;
                                C21992dm.AFInAppEventType = i9 - 1;
                                C21992dm.AFInAppEventParameterName = (char) (C21992dm.valueOf + (((short) (sArr[i9] + s)) ^ C21992dm.AFKeystoreWrapper));
                            }
                            sb.append(C21992dm.AFInAppEventParameterName);
                            C21992dm.valueOf = C21992dm.AFInAppEventParameterName;
                            C21992dm.values++;
                        }
                    }
                    obj = sb.toString();
                }
                return obj;
            }
        }

        public C21945e(Map<String, Object> map, Context context) {
            this.values = map;
            this.valueOf = context;
            put(AFInAppEventType(), AFKeystoreWrapper());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
            r2.append(java.lang.Integer.toHexString(r7.intValue()));
            r4 = r4 + 1;
            r5 = init + 73;
            onDeepLinkingNative = r5 % 128;
            r5 = r5 % 2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.StringBuilder AFInAppEventParameterName(@android.support.annotation.NonNull java.lang.String... r10) throws java.lang.Exception {
            /*
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = 0
                r2 = r1
            L_0x0007:
                r3 = 3
                if (r2 >= r3) goto L_0x003e
                int r3 = init
                int r3 = r3 + 81
                int r4 = r3 % 128
                onDeepLinkingNative = r4
                int r3 = r3 % 2
                r4 = 12
                if (r3 != 0) goto L_0x001b
                r3 = 96
                goto L_0x001c
            L_0x001b:
                r3 = r4
            L_0x001c:
                if (r3 == r4) goto L_0x002e
                r3 = r10[r2]
                int r3 = r3.length()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.add(r3)
                int r2 = r2 + 40
                goto L_0x0007
            L_0x002e:
                r3 = r10[r2]
                int r3 = r3.length()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.add(r3)
                int r2 = r2 + 1
                goto L_0x0007
            L_0x003e:
                java.util.Collections.sort(r0)
                java.lang.Object r0 = r0.get(r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r4 = r1
            L_0x0051:
                if (r4 >= r0) goto L_0x009a
                r5 = 0
                r6 = r1
                r7 = r5
            L_0x0056:
                r8 = 48
                if (r6 >= r3) goto L_0x005c
                r9 = r8
                goto L_0x005e
            L_0x005c:
                r9 = 18
            L_0x005e:
                if (r9 == r8) goto L_0x0078
                int r5 = r7.intValue()
                java.lang.String r5 = java.lang.Integer.toHexString(r5)
                r2.append(r5)
                int r4 = r4 + 1
                int r5 = init
                int r5 = r5 + 73
                int r6 = r5 % 128
                onDeepLinkingNative = r6
                int r5 = r5 % 2
                goto L_0x0051
            L_0x0078:
                r8 = r10[r6]
                char r8 = r8.charAt(r4)
                if (r7 != 0) goto L_0x008e
                int r7 = onDeepLinkingNative
                int r7 = r7 + 11
                int r9 = r7 % 128
                init = r9
                int r7 = r7 % 2
                if (r7 != 0) goto L_0x008d
                goto L_0x0093
            L_0x008d:
                throw r5
            L_0x008e:
                int r7 = r7.intValue()
                r8 = r8 ^ r7
            L_0x0093:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
                int r6 = r6 + 1
                goto L_0x0056
            L_0x009a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21944c.C21945e.AFInAppEventParameterName(java.lang.String[]):java.lang.StringBuilder");
        }

        @NonNull
        private String AFInAppEventType() {
            boolean z;
            char c;
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                String obj = this.values.get(AFInAppEventParameterName((char) Drawable.resolveOpacity(0, 0), "\u0000\u0000\u0000\u0000", "姨呗锌Ĝ䢆뵿䉝쀽骷گ˰쒳", "ရ꙽ѧ䆫", KeyEvent.keyCodeFromString("")).intern()).toString();
                String obj2 = this.values.get(values("抷乡㎌嵀", 5 - ExpandableListView.getPackedPositionGroup(0)).intern()).toString();
                boolean z2 = true;
                if (obj2 == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    int i = init + 103;
                    onDeepLinkingNative = i % 128;
                    int i2 = i % 2;
                    obj2 = AFInAppEventParameterName((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0000\u0000\u0000\u0000", "䧰咽軨ട᯻參ﶾ", "푍⹮碩", -1 - TextUtils.indexOf("", '0')).intern();
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder AFInAppEventParameterName2 = AFInAppEventParameterName(num, obj2, sb.toString());
                int length = AFInAppEventParameterName2.length();
                if (length > 4) {
                    z2 = false;
                }
                if (z2) {
                    while (true) {
                        if (length < 4) {
                            c = 7;
                        } else {
                            c = '@';
                        }
                        if (c == '@') {
                            break;
                        }
                        int i3 = onDeepLinkingNative + 17;
                        init = i3 % 128;
                        if (i3 % 2 != 0) {
                            length += 95;
                            AFInAppEventParameterName2.append('!');
                        } else {
                            length++;
                            AFInAppEventParameterName2.append('1');
                        }
                    }
                } else {
                    int i4 = init + 57;
                    onDeepLinkingNative = i4 % 128;
                    int i5 = i4 % 2;
                    AFInAppEventParameterName2.delete(4, length);
                }
                AFInAppEventParameterName2.insert(0, values("蠊囮洼ᴦ", (ViewConfiguration.getJumpTapTimeout() >> 16) + 3).intern());
                return AFInAppEventParameterName2.toString();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AFInAppEventParameterName((char) (Color.red(0) + 14684), "\u0000\u0000\u0000\u0000", "⩧㬪ᘊ鶫磶鑘ཽ뼡嵛롹ｖ녱ᢾ퍜ᐬ쿫樢솴ᯩ㶨桺䮾穸洓۩す란¬來劦뼾趧ऊ৯儶둉", "뫛䮉岻㘹", Process.myPid() >> 22).intern());
                sb2.append(e);
                AFLogger.AFInAppEventType(sb2.toString());
                return AFInAppEventParameterName((char) View.resolveSizeAndState(0, 0, 0), "\u0000\u0000\u0000\u0000", "䊸㦟⻟鵻튟띯", "鶗럘伜௴", 481810589 - (ViewConfiguration.getScrollBarSize() >> 8)).intern();
            }
        }

        private String AFKeystoreWrapper() {
            String str;
            boolean z;
            int i;
            boolean z2;
            try {
                String obj = this.values.get(AFInAppEventParameterName((char) (-1 - TextUtils.indexOf("", '0')), "\u0000\u0000\u0000\u0000", "姨呗锌Ĝ䢆뵿䉝쀽骷گ˰쒳", "ရ꙽ѧ䆫", (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 1).intern()).toString();
                String obj2 = this.values.get(values("궰뀎?♇ﳻ딿Ꮧ㤚濂꧛滍⹕厇魅", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15).intern()).toString();
                String replaceAll = AFInAppEventParameterName((char) (Color.blue(0) + 42625), "\u0000\u0000\u0000\u0000", "ኧ麚촐羿鉮", "耲먥臠䢦", (ViewConfiguration.getTouchSlop() >> 8) - 524671616).intern().replaceAll(AFInAppEventParameterName((char) (View.MeasureSpec.getMode(0) + 28066), "\u0000\u0000\u0000\u0000", "煶ℿ鍿煥", "碶晝ꉎ쩭", Color.argb(0, 0, 0, 0) + 1315331448).intern(), "");
                StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append(obj2);
                sb.append(replaceAll);
                String values2 = C21859ae.values(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(values2.substring(0, 16));
                str = sb2.toString();
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(AFInAppEventParameterName((char) (ExpandableListView.getPackedPositionGroup(0) + 23891), "\u0000\u0000\u0000\u0000", "赳?蝈䴀휨닶븕狽⑉ण䛊ᒭ첈ྒྷ劣崧⹲쾚噣白?툈ꢣ垪⫾퀢䴯൹裥吏蚡鉆ꪢࢳ좀ˋ鱍?申޺", "虜㗞匯鹝", ViewConfiguration.getEdgeSlop() >> 16).intern());
                sb3.append(e);
                AFLogger.AFInAppEventType(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("");
                sb4.append(AFInAppEventParameterName((char) ((SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)) + 47474), "\u0000\u0000\u0000\u0000", "ᬥאָ鐏셡ꈨࠅ䇳全Ⳏꊪﻞ᰼ᩓ罅輦䍅詍", "ꁅ墡玪욹", Color.rgb(0, 0, 0) + 16777216).intern());
                str = sb4.toString();
            }
            String str2 = str;
            try {
                Intent registerReceiver = this.valueOf.registerReceiver((BroadcastReceiver) null, new IntentFilter(values("乡㹚庀ꇕ뚂퓡㣛ᄺ鲮퐡则⭎ᄠᤙ䁈뙢掹䈥ﱖ苃ೂ?㣯縁燉䷗?榗⨻綣?傫\f", 37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()));
                int i2 = -2700;
                if (registerReceiver != null) {
                    int i3 = onDeepLinkingNative + 39;
                    init = i3 % 128;
                    if (i3 % 2 != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        i2 = registerReceiver.getIntExtra(AFInAppEventParameterName((char) (AudioTrack.getMinVolume() > 1.0f ? 1 : (AudioTrack.getMinVolume() == 1.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", "笶錝戁ᰐ㤐強箓薓胗유棄", "媱ᑉᄷ⢾", 924076378 << View.MeasureSpec.getMode(0)).intern(), 29414);
                    } else {
                        i2 = registerReceiver.getIntExtra(AFInAppEventParameterName((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", "笶錝戁ᰐ㤐強箓薓胗유棄", "媱ᑉᄷ⢾", 924076378 - View.MeasureSpec.getMode(0)).intern(), -2700);
                    }
                }
                String str3 = this.valueOf.getApplicationInfo().nativeLibraryDir;
                if (str3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || !str3.contains(values("㱎캳強霳", Drawable.resolveOpacity(0, 0) + 3).intern())) {
                    int i4 = init + 47;
                    onDeepLinkingNative = i4 % 128;
                    int i5 = i4 % 2;
                    i = 0;
                } else {
                    i = 1;
                }
                int size = ((SensorManager) this.valueOf.getSystemService(values("䣑鄐積?숟", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6).intern())).getSensorList(-1).size();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(values("᳆䠚", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1).intern());
                sb5.append(i2);
                sb5.append(AFInAppEventParameterName((char) (62432 - (ViewConfiguration.getEdgeSlop() >> 16)), "\u0000\u0000\u0000\u0000", "헵᪒", "卌慎◳", (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)) - 1).intern());
                sb5.append(i);
                sb5.append(AFInAppEventParameterName((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 8558), "\u0000\u0000\u0000\u0000", "ℏ?", "㿜滞琡", TextUtils.getCapsMode("", 0, 0)).intern());
                sb5.append(size);
                sb5.append(AFInAppEventParameterName((char) (9330 - TextUtils.indexOf("", "", 0)), "\u0000\u0000\u0000\u0000", "涀С", "墁❻狚쌤", ExpandableListView.getPackedPositionChild(0) + 1).intern());
                sb5.append(this.values.size());
                String obj3 = sb5.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str2);
                sb6.append(C21946a.valueOf(obj3));
                return sb6.toString();
            } catch (Exception e2) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(AFInAppEventParameterName((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23891), "\u0000\u0000\u0000\u0000", "赳?蝈䴀휨닶븕狽⑉ण䛊ᒭ첈ྒྷ劣崧⹲쾚噣白?툈ꢣ垪⫾퀢䴯൹裥吏蚡鉆ꪢࢳ좀ˋ鱍?申޺", "虜㗞匯鹝", 1 - (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1))).intern());
                sb7.append(e2);
                AFLogger.AFInAppEventType(sb7.toString());
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str2);
                sb8.append(values("䝧⽤꾳䓟檙䔭㨓夰熇筼?囓궁", 16 - View.resolveSize(0, 0)).intern());
                return sb8.toString();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: char[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.String} */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String values(java.lang.String r12, int r13) {
            /*
                if (r12 == 0) goto L_0x0006
                char[] r12 = r12.toCharArray()
            L_0x0006:
                char[] r12 = (char[]) r12
                java.lang.Object r0 = com.appsflyer.internal.C21991dl.AFKeystoreWrapper
                monitor-enter(r0)
                int r1 = r12.length     // Catch:{ all -> 0x0073 }
                char[] r1 = new char[r1]     // Catch:{ all -> 0x0073 }
                r2 = 0
                com.appsflyer.internal.C21991dl.AFInAppEventParameterName = r2     // Catch:{ all -> 0x0073 }
                r3 = 2
                char[] r3 = new char[r3]     // Catch:{ all -> 0x0073 }
            L_0x0014:
                int r4 = com.appsflyer.internal.C21991dl.AFInAppEventParameterName     // Catch:{ all -> 0x0073 }
                int r5 = r12.length     // Catch:{ all -> 0x0073 }
                if (r4 >= r5) goto L_0x006c
                char r5 = r12[r4]     // Catch:{ all -> 0x0073 }
                r3[r2] = r5     // Catch:{ all -> 0x0073 }
                int r4 = r4 + 1
                char r4 = r12[r4]     // Catch:{ all -> 0x0073 }
                r5 = 1
                r3[r5] = r4     // Catch:{ all -> 0x0073 }
                r4 = 58224(0xe370, float:8.1589E-41)
                r6 = r2
            L_0x0028:
                r7 = 16
                if (r6 >= r7) goto L_0x005b
                char r7 = r3[r5]     // Catch:{ all -> 0x0073 }
                char r8 = r3[r2]     // Catch:{ all -> 0x0073 }
                int r9 = r8 + r4
                int r10 = r8 << 4
                char r11 = AFVersionDeclaration     // Catch:{ all -> 0x0073 }
                int r10 = r10 + r11
                r9 = r9 ^ r10
                int r10 = r8 >>> 5
                char r11 = AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x0073 }
                int r10 = r10 + r11
                r9 = r9 ^ r10
                int r7 = r7 - r9
                char r7 = (char) r7     // Catch:{ all -> 0x0073 }
                r3[r5] = r7     // Catch:{ all -> 0x0073 }
                int r9 = r7 + r4
                int r10 = r7 << 4
                char r11 = AFLogger$LogLevel     // Catch:{ all -> 0x0073 }
                int r10 = r10 + r11
                r9 = r9 ^ r10
                int r7 = r7 >>> 5
                char r10 = getLevel     // Catch:{ all -> 0x0073 }
                int r7 = r7 + r10
                r7 = r7 ^ r9
                int r8 = r8 - r7
                char r7 = (char) r8     // Catch:{ all -> 0x0073 }
                r3[r2] = r7     // Catch:{ all -> 0x0073 }
                r7 = 40503(0x9e37, float:5.6757E-41)
                int r4 = r4 - r7
                int r6 = r6 + 1
                goto L_0x0028
            L_0x005b:
                int r4 = com.appsflyer.internal.C21991dl.AFInAppEventParameterName     // Catch:{ all -> 0x0073 }
                char r6 = r3[r2]     // Catch:{ all -> 0x0073 }
                r1[r4] = r6     // Catch:{ all -> 0x0073 }
                int r6 = r4 + 1
                char r5 = r3[r5]     // Catch:{ all -> 0x0073 }
                r1[r6] = r5     // Catch:{ all -> 0x0073 }
                int r4 = r4 + 2
                com.appsflyer.internal.C21991dl.AFInAppEventParameterName = r4     // Catch:{ all -> 0x0073 }
                goto L_0x0014
            L_0x006c:
                java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x0073 }
                r12.<init>(r1, r2, r13)     // Catch:{ all -> 0x0073 }
                monitor-exit(r0)     // Catch:{ all -> 0x0073 }
                return r12
            L_0x0073:
                r12 = move-exception
                monitor-exit(r0)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21944c.C21945e.values(java.lang.String, int):java.lang.String");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: char[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: char[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: char[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: char[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: char[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.String} */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String AFInAppEventParameterName(char r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11) {
            /*
                if (r10 == 0) goto L_0x0006
                char[] r10 = r10.toCharArray()
            L_0x0006:
                char[] r10 = (char[]) r10
                if (r9 == 0) goto L_0x000e
                char[] r9 = r9.toCharArray()
            L_0x000e:
                char[] r9 = (char[]) r9
                if (r8 == 0) goto L_0x0016
                char[] r8 = r8.toCharArray()
            L_0x0016:
                char[] r8 = (char[]) r8
                java.lang.Object r0 = com.appsflyer.internal.C21989dj.AFKeystoreWrapper
                monitor-enter(r0)
                java.lang.Object r10 = r10.clone()     // Catch:{ all -> 0x0083 }
                char[] r10 = (char[]) r10     // Catch:{ all -> 0x0083 }
                java.lang.Object r8 = r8.clone()     // Catch:{ all -> 0x0083 }
                char[] r8 = (char[]) r8     // Catch:{ all -> 0x0083 }
                r1 = 0
                char r2 = r10[r1]     // Catch:{ all -> 0x0083 }
                r7 = r7 ^ r2
                char r7 = (char) r7     // Catch:{ all -> 0x0083 }
                r10[r1] = r7     // Catch:{ all -> 0x0083 }
                r7 = 2
                char r2 = r8[r7]     // Catch:{ all -> 0x0083 }
                char r11 = (char) r11     // Catch:{ all -> 0x0083 }
                int r2 = r2 + r11
                char r11 = (char) r2     // Catch:{ all -> 0x0083 }
                r8[r7] = r11     // Catch:{ all -> 0x0083 }
                int r7 = r9.length     // Catch:{ all -> 0x0083 }
                char[] r11 = new char[r7]     // Catch:{ all -> 0x0083 }
                com.appsflyer.internal.C21989dj.valueOf = r1     // Catch:{ all -> 0x0083 }
            L_0x003b:
                int r1 = com.appsflyer.internal.C21989dj.valueOf     // Catch:{ all -> 0x0083 }
                if (r1 >= r7) goto L_0x007c
                int r2 = r1 + 2
                int r2 = r2 % 4
                int r3 = r1 + 3
                int r3 = r3 % 4
                int r1 = r1 % 4
                char r1 = r10[r1]     // Catch:{ all -> 0x0083 }
                int r1 = r1 * 32718
                char r2 = r8[r2]     // Catch:{ all -> 0x0083 }
                int r1 = r1 + r2
                r4 = 65535(0xffff, float:9.1834E-41)
                int r1 = r1 % r4
                char r1 = (char) r1     // Catch:{ all -> 0x0083 }
                com.appsflyer.internal.C21989dj.values = r1     // Catch:{ all -> 0x0083 }
                char r5 = r10[r3]     // Catch:{ all -> 0x0083 }
                int r5 = r5 * 32718
                int r5 = r5 + r2
                int r5 = r5 / r4
                char r2 = (char) r5     // Catch:{ all -> 0x0083 }
                r8[r3] = r2     // Catch:{ all -> 0x0083 }
                r10[r3] = r1     // Catch:{ all -> 0x0083 }
                int r2 = com.appsflyer.internal.C21989dj.valueOf     // Catch:{ all -> 0x0083 }
                char r3 = r9[r2]     // Catch:{ all -> 0x0083 }
                r1 = r1 ^ r3
                long r3 = (long) r1     // Catch:{ all -> 0x0083 }
                long r5 = AFKeystoreWrapper     // Catch:{ all -> 0x0083 }
                long r3 = r3 ^ r5
                int r1 = AFInAppEventType     // Catch:{ all -> 0x0083 }
                long r5 = (long) r1     // Catch:{ all -> 0x0083 }
                long r3 = r3 ^ r5
                char r1 = AFInAppEventParameterName     // Catch:{ all -> 0x0083 }
                long r5 = (long) r1     // Catch:{ all -> 0x0083 }
                long r3 = r3 ^ r5
                int r1 = (int) r3     // Catch:{ all -> 0x0083 }
                char r1 = (char) r1     // Catch:{ all -> 0x0083 }
                r11[r2] = r1     // Catch:{ all -> 0x0083 }
                int r2 = r2 + 1
                com.appsflyer.internal.C21989dj.valueOf = r2     // Catch:{ all -> 0x0083 }
                goto L_0x003b
            L_0x007c:
                java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x0083 }
                r7.<init>(r11)     // Catch:{ all -> 0x0083 }
                monitor-exit(r0)     // Catch:{ all -> 0x0083 }
                return r7
            L_0x0083:
                r7 = move-exception
                monitor-exit(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21944c.C21945e.AFInAppEventParameterName(char, java.lang.String, java.lang.String, java.lang.String, int):java.lang.String");
        }
    }

    private static boolean AFKeystoreWrapper(String str) {
        int i = AFInAppEventType + 71;
        AFInAppEventParameterName = i % 128;
        if (i % 2 != 0) {
        }
        try {
            Class.forName(str);
            int i2 = AFInAppEventParameterName + 51;
            AFInAppEventType = i2 % 128;
            if ((i2 % 2 == 0 ? C12361b.f30260k : 2) == 2) {
                return true;
            }
            throw null;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static String AFKeystoreWrapper(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, values(str2).charAt(0));
        String obj = sb.toString();
        int i2 = AFInAppEventType + 75;
        AFInAppEventParameterName = i2 % 128;
        if ((i2 % 2 != 0 ? 'K' : '7') != 'K') {
            return obj;
        }
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.lang.String} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=int, for r8v3, types: [char] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String AFInAppEventType(int[] r12, boolean r13, java.lang.String r14) {
        /*
            if (r14 == 0) goto L_0x0008
            java.lang.String r0 = "ISO-8859-1"
            byte[] r14 = r14.getBytes(r0)
        L_0x0008:
            byte[] r14 = (byte[]) r14
            java.lang.Object r0 = com.appsflyer.internal.C21988di.values
            monitor-enter(r0)
            r1 = 0
            r2 = r12[r1]     // Catch:{ all -> 0x0089 }
            r3 = 1
            r4 = r12[r3]     // Catch:{ all -> 0x0089 }
            r5 = 2
            r6 = r12[r5]     // Catch:{ all -> 0x0089 }
            r7 = 3
            r7 = r12[r7]     // Catch:{ all -> 0x0089 }
            char[] r8 = values     // Catch:{ all -> 0x0089 }
            char[] r9 = new char[r4]     // Catch:{ all -> 0x0089 }
            java.lang.System.arraycopy(r8, r2, r9, r1, r4)     // Catch:{ all -> 0x0089 }
            if (r14 == 0) goto L_0x0047
            char[] r2 = new char[r4]     // Catch:{ all -> 0x0089 }
            com.appsflyer.internal.C21988di.AFInAppEventType = r1     // Catch:{ all -> 0x0089 }
            r8 = r1
        L_0x0027:
            int r10 = com.appsflyer.internal.C21988di.AFInAppEventType     // Catch:{ all -> 0x0089 }
            if (r10 >= r4) goto L_0x0046
            byte r11 = r14[r10]     // Catch:{ all -> 0x0089 }
            if (r11 != r3) goto L_0x0038
            char r11 = r9[r10]     // Catch:{ all -> 0x0089 }
            int r11 = r11 << r3
            int r11 = r11 + r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch:{ all -> 0x0089 }
            r2[r10] = r8     // Catch:{ all -> 0x0089 }
            goto L_0x003f
        L_0x0038:
            char r11 = r9[r10]     // Catch:{ all -> 0x0089 }
            int r11 = r11 << r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch:{ all -> 0x0089 }
            r2[r10] = r8     // Catch:{ all -> 0x0089 }
        L_0x003f:
            char r8 = r2[r10]     // Catch:{ all -> 0x0089 }
            int r10 = r10 + 1
            com.appsflyer.internal.C21988di.AFInAppEventType = r10     // Catch:{ all -> 0x0089 }
            goto L_0x0027
        L_0x0046:
            r9 = r2
        L_0x0047:
            if (r7 <= 0) goto L_0x0056
            char[] r14 = new char[r4]     // Catch:{ all -> 0x0089 }
            java.lang.System.arraycopy(r9, r1, r14, r1, r4)     // Catch:{ all -> 0x0089 }
            int r2 = r4 - r7
            java.lang.System.arraycopy(r14, r1, r9, r2, r7)     // Catch:{ all -> 0x0089 }
            java.lang.System.arraycopy(r14, r7, r9, r1, r2)     // Catch:{ all -> 0x0089 }
        L_0x0056:
            if (r13 == 0) goto L_0x006d
            char[] r13 = new char[r4]     // Catch:{ all -> 0x0089 }
            com.appsflyer.internal.C21988di.AFInAppEventType = r1     // Catch:{ all -> 0x0089 }
        L_0x005c:
            int r14 = com.appsflyer.internal.C21988di.AFInAppEventType     // Catch:{ all -> 0x0089 }
            if (r14 >= r4) goto L_0x006c
            int r2 = r4 - r14
            int r2 = r2 - r3
            char r2 = r9[r2]     // Catch:{ all -> 0x0089 }
            r13[r14] = r2     // Catch:{ all -> 0x0089 }
            int r14 = r14 + 1
            com.appsflyer.internal.C21988di.AFInAppEventType = r14     // Catch:{ all -> 0x0089 }
            goto L_0x005c
        L_0x006c:
            r9 = r13
        L_0x006d:
            if (r6 <= 0) goto L_0x0082
            com.appsflyer.internal.C21988di.AFInAppEventType = r1     // Catch:{ all -> 0x0089 }
        L_0x0071:
            int r13 = com.appsflyer.internal.C21988di.AFInAppEventType     // Catch:{ all -> 0x0089 }
            if (r13 >= r4) goto L_0x0082
            char r14 = r9[r13]     // Catch:{ all -> 0x0089 }
            r1 = r12[r5]     // Catch:{ all -> 0x0089 }
            int r14 = r14 - r1
            char r14 = (char) r14     // Catch:{ all -> 0x0089 }
            r9[r13] = r14     // Catch:{ all -> 0x0089 }
            int r13 = r13 + 1
            com.appsflyer.internal.C21988di.AFInAppEventType = r13     // Catch:{ all -> 0x0089 }
            goto L_0x0071
        L_0x0082:
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x0089 }
            r12.<init>(r9)     // Catch:{ all -> 0x0089 }
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            return r12
        L_0x0089:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21944c.AFInAppEventType(int[], boolean, java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.String} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String AFKeystoreWrapper(java.lang.String r8, int r9) {
        /*
            if (r8 == 0) goto L_0x0006
            char[] r8 = r8.toCharArray()
        L_0x0006:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.appsflyer.internal.C21990dk.AFInAppEventParameterName
            monitor-enter(r0)
            long r1 = AFKeystoreWrapper     // Catch:{ all -> 0x0042 }
            char[] r8 = com.appsflyer.internal.C21990dk.AFKeystoreWrapper(r1, r8, r9)     // Catch:{ all -> 0x0042 }
            r9 = 4
            com.appsflyer.internal.C21990dk.AFKeystoreWrapper = r9     // Catch:{ all -> 0x0042 }
        L_0x0014:
            int r1 = com.appsflyer.internal.C21990dk.AFKeystoreWrapper     // Catch:{ all -> 0x0042 }
            int r2 = r8.length     // Catch:{ all -> 0x0042 }
            if (r1 >= r2) goto L_0x0039
            int r1 = r1 + -4
            com.appsflyer.internal.C21990dk.AFInAppEventType = r1     // Catch:{ all -> 0x0042 }
            int r1 = com.appsflyer.internal.C21990dk.AFKeystoreWrapper     // Catch:{ all -> 0x0042 }
            char r2 = r8[r1]     // Catch:{ all -> 0x0042 }
            int r3 = r1 % 4
            char r3 = r8[r3]     // Catch:{ all -> 0x0042 }
            r2 = r2 ^ r3
            long r2 = (long) r2     // Catch:{ all -> 0x0042 }
            int r4 = com.appsflyer.internal.C21990dk.AFInAppEventType     // Catch:{ all -> 0x0042 }
            long r4 = (long) r4     // Catch:{ all -> 0x0042 }
            long r6 = AFKeystoreWrapper     // Catch:{ all -> 0x0042 }
            long r4 = r4 * r6
            long r2 = r2 ^ r4
            int r2 = (int) r2     // Catch:{ all -> 0x0042 }
            char r2 = (char) r2     // Catch:{ all -> 0x0042 }
            r8[r1] = r2     // Catch:{ all -> 0x0042 }
            int r1 = com.appsflyer.internal.C21990dk.AFKeystoreWrapper     // Catch:{ all -> 0x0042 }
            int r1 = r1 + 1
            com.appsflyer.internal.C21990dk.AFKeystoreWrapper = r1     // Catch:{ all -> 0x0042 }
            goto L_0x0014
        L_0x0039:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0042 }
            int r2 = r8.length     // Catch:{ all -> 0x0042 }
            int r2 = r2 - r9
            r1.<init>(r8, r9, r2)     // Catch:{ all -> 0x0042 }
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return r1
        L_0x0042:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21944c.AFKeystoreWrapper(java.lang.String, int):java.lang.String");
    }

    private static String values(String str) {
        int i = AFInAppEventParameterName + 87;
        AFInAppEventType = i % 128;
        int i2 = i % 2;
        String num = Integer.toString(Integer.parseInt(str, 2), 16);
        int i3 = AFInAppEventType + 115;
        AFInAppEventParameterName = i3 % 128;
        int i4 = i3 % 2;
        return num;
    }

    private static String values(Context context) {
        PackageManager packageManager;
        String packageName;
        int i = AFInAppEventParameterName + 111;
        AFInAppEventType = i % 128;
        if ((i % 2 == 0 ? (char) 14 : 18) != 14) {
            try {
                packageManager = context.getPackageManager();
                packageName = context.getPackageName();
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } else {
            packageManager = context.getPackageManager();
            packageName = context.getPackageName();
        }
        String str = packageManager.getPackageInfo(packageName, 0).packageName;
        int i2 = AFInAppEventParameterName + 115;
        AFInAppEventType = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
