package androidx.datastore.preferences.protobuf;

import com.google.android.datatransport.cct.C40042a;

/* renamed from: androidx.datastore.preferences.protobuf.k3 */
public final class C18789k3 {

    /* renamed from: androidx.datastore.preferences.protobuf.k3$a */
    public static class C18790a implements C18792c {

        /* renamed from: a */
        public final /* synthetic */ ByteString f47903a;

        public C18790a(ByteString byteString) {
            this.f47903a = byteString;
        }

        /* renamed from: a */
        public byte mo54922a(int i) {
            return this.f47903a.mo53760q(i);
        }

        public int size() {
            return this.f47903a.size();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.k3$b */
    public static class C18791b implements C18792c {

        /* renamed from: a */
        public final /* synthetic */ byte[] f47904a;

        public C18791b(byte[] bArr) {
            this.f47904a = bArr;
        }

        /* renamed from: a */
        public byte mo54922a(int i) {
            return this.f47904a[i];
        }

        public int size() {
            return this.f47904a.length;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.k3$c */
    public interface C18792c {
        /* renamed from: a */
        byte mo54922a(int i);

        int size();
    }

    /* renamed from: a */
    public static String m86480a(ByteString byteString) {
        return m86481b(new C18790a(byteString));
    }

    /* renamed from: b */
    public static String m86481b(C18792c cVar) {
        StringBuilder sb = new StringBuilder(cVar.size());
        for (int i = 0; i < cVar.size(); i++) {
            byte a = cVar.mo54922a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
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
                        if (a >= 32 && a <= 126) {
                            sb.append((char) a);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
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

    /* renamed from: c */
    public static String m86482c(byte[] bArr) {
        return m86481b(new C18791b(bArr));
    }

    /* renamed from: d */
    public static String m86483d(String str) {
        return str.replace(C40042a.f102078h, "\\\\").replace("\"", "\\\"");
    }

    /* renamed from: e */
    public static String m86484e(String str) {
        return m86480a(ByteString.m84390e0(str));
    }
}
