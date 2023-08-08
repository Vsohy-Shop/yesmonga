package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.xb */
public final class C42264xb {
    /* renamed from: a */
    public static String m171118a(zzka zzka) {
        StringBuilder sb = new StringBuilder(zzka.mo137593i());
        for (int i = 0; i < zzka.mo137593i(); i++) {
            byte e = zzka.mo137591e(i);
            if (e == 34) {
                sb.append("\\\"");
            } else if (e == 39) {
                sb.append("\\'");
            } else if (e != 92) {
                switch (e) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (e >= 32 && e <= 126) {
                            sb.append((char) e);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((e >>> 6) & 3) + 48));
                            sb.append((char) (((e >>> 3) & 7) + 48));
                            sb.append((char) ((e & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
