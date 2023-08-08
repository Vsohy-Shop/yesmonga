package com.google.protobuf;

import com.google.android.datatransport.cct.C40042a;

/* renamed from: com.google.protobuf.q2 */
public final class C34440q2 {

    /* renamed from: com.google.protobuf.q2$a */
    public static class C34441a implements C34443c {

        /* renamed from: a */
        public final /* synthetic */ ByteString f83455a;

        public C34441a(ByteString byteString) {
            this.f83455a = byteString;
        }

        /* renamed from: a */
        public byte mo101501a(int i) {
            return this.f83455a.mo99248q(i);
        }

        public int size() {
            return this.f83455a.size();
        }
    }

    /* renamed from: com.google.protobuf.q2$b */
    public static class C34442b implements C34443c {

        /* renamed from: a */
        public final /* synthetic */ byte[] f83456a;

        public C34442b(byte[] bArr) {
            this.f83456a = bArr;
        }

        /* renamed from: a */
        public byte mo101501a(int i) {
            return this.f83456a[i];
        }

        public int size() {
            return this.f83456a.length;
        }
    }

    /* renamed from: com.google.protobuf.q2$c */
    public interface C34443c {
        /* renamed from: a */
        byte mo101501a(int i);

        int size();
    }

    /* renamed from: a */
    public static String m140133a(ByteString byteString) {
        return m140134b(new C34441a(byteString));
    }

    /* renamed from: b */
    public static String m140134b(C34443c cVar) {
        StringBuilder sb = new StringBuilder(cVar.size());
        for (int i = 0; i < cVar.size(); i++) {
            byte a = cVar.mo101501a(i);
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
    public static String m140135c(byte[] bArr) {
        return m140134b(new C34442b(bArr));
    }

    /* renamed from: d */
    public static String m140136d(String str) {
        return str.replace(C40042a.f102078h, "\\\\").replace("\"", "\\\"");
    }

    /* renamed from: e */
    public static String m140137e(String str) {
        return m140133a(ByteString.m137260e0(str));
    }
}
