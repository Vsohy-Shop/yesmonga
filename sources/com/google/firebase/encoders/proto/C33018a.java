package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;
import java.lang.annotation.Annotation;

/* renamed from: com.google.firebase.encoders.proto.a */
public final class C33018a {

    /* renamed from: a */
    public int f80116a;

    /* renamed from: b */
    public Protobuf.IntEncoding f80117b = Protobuf.IntEncoding.DEFAULT;

    /* renamed from: com.google.firebase.encoders.proto.a$a */
    public static final class C33019a implements Protobuf {

        /* renamed from: c4 */
        public final int f80118c4;

        /* renamed from: d4 */
        public final Protobuf.IntEncoding f80119d4;

        public C33019a(int i, Protobuf.IntEncoding intEncoding) {
            this.f80118c4 = i;
            this.f80119d4 = intEncoding;
        }

        public Class<? extends Annotation> annotationType() {
            return Protobuf.class;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            if (this.f80118c4 != protobuf.tag() || !this.f80119d4.equals(protobuf.intEncoding())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (14552422 ^ this.f80118c4) + (this.f80119d4.hashCode() ^ 2041407134);
        }

        public Protobuf.IntEncoding intEncoding() {
            return this.f80119d4;
        }

        public int tag() {
            return this.f80118c4;
        }

        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.f80118c4 + "intEncoding=" + this.f80119d4 + ')';
        }
    }

    /* renamed from: b */
    public static C33018a m133253b() {
        return new C33018a();
    }

    /* renamed from: a */
    public Protobuf mo95666a() {
        return new C33019a(this.f80116a, this.f80117b);
    }

    /* renamed from: c */
    public C33018a mo95667c(Protobuf.IntEncoding intEncoding) {
        this.f80117b = intEncoding;
        return this;
    }

    /* renamed from: d */
    public C33018a mo95668d(int i) {
        this.f80116a = i;
        return this;
    }
}
