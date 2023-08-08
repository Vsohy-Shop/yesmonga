package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.s9 */
public final class C14701s9 {

    /* renamed from: com.contentsquare.android.sdk.s9$a */
    public static class C14702a implements C14703b {

        /* renamed from: a */
        public final /* synthetic */ C14719t0 f36385a;

        public C14702a(C14719t0 t0Var) {
            this.f36385a = t0Var;
        }

        /* renamed from: b */
        public byte mo36393b(int i) {
            return this.f36385a.mo36429e0(i);
        }

        public int size() {
            return this.f36385a.size();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.s9$b */
    public interface C14703b {
        /* renamed from: b */
        byte mo36393b(int i);

        int size();
    }

    /* renamed from: a */
    public static String m63395a(C14703b bVar) {
        String str;
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i = 0; i < bVar.size(); i++) {
            int b = bVar.mo36393b(i);
            if (b == 34) {
                str = "\\\"";
            } else if (b == 39) {
                str = "\\'";
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            b = (b & 7) + 48;
                        }
                        sb.append((char) b);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m63396b(C14719t0 t0Var) {
        return m63395a(new C14702a(t0Var));
    }

    /* renamed from: c */
    public static String m63397c(String str) {
        return m63396b(C14719t0.m63433i(str));
    }
}
