package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.C18665a;
import androidx.datastore.preferences.protobuf.C18665a.C18666a;
import androidx.datastore.preferences.protobuf.C18920z1;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.a */
public abstract class C18665a<MessageType extends C18665a<MessageType, BuilderType>, BuilderType extends C18666a<MessageType, BuilderType>> implements C18920z1 {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$b */
    public interface C18668b {
        int getNumber();
    }

    @Deprecated
    /* renamed from: a */
    public static <T> void m85405a(Iterable<T> iterable, Collection<? super T> collection) {
        C18666a.m85414S(iterable, (List) collection);
    }

    /* renamed from: d */
    public static <T> void m85406d(Iterable<T> iterable, List<? super T> list) {
        C18666a.m85414S(iterable, list);
    }

    /* renamed from: p */
    public static void m85407p(ByteString byteString) throws IllegalArgumentException {
        if (!byteString.mo53762s0()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo53997q() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: r */
    public int mo54251r(C18905x2 x2Var) {
        int q = mo53997q();
        if (q != -1) {
            return q;
        }
        int d = x2Var.mo54449d(this);
        mo54003z(d);
        return d;
    }

    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream n1 = CodedOutputStream.m84519n1(bArr);
            mo53979J(n1);
            n1.mo53826Z();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(mo54254w("byte array"), e);
        }
    }

    public ByteString toByteString() {
        try {
            ByteString.C18615g u0 = ByteString.m84393u0(getSerializedSize());
            mo53979J(u0.mo53781b());
            return u0.mo53780a();
        } catch (IOException e) {
            throw new RuntimeException(mo54254w("ByteString"), e);
        }
    }

    /* renamed from: w */
    public final String mo54254w(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        CodedOutputStream k1 = CodedOutputStream.m84513k1(outputStream, CodedOutputStream.m84478J0(CodedOutputStream.m84480L0(serializedSize) + serializedSize));
        k1.mo53827Z1(serializedSize);
        mo53979J(k1);
        k1.mo53833e1();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        CodedOutputStream k1 = CodedOutputStream.m84513k1(outputStream, CodedOutputStream.m84478J0(getSerializedSize()));
        mo53979J(k1);
        k1.mo53833e1();
    }

    /* renamed from: y */
    public UninitializedMessageException mo54257y() {
        return new UninitializedMessageException((C18920z1) this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo54003z(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.a$a */
    public static abstract class C18666a<MessageType extends C18665a<MessageType, BuilderType>, BuilderType extends C18666a<MessageType, BuilderType>> implements C18920z1.C18921a {
        @Deprecated
        /* renamed from: R */
        public static <T> void m85413R(Iterable<T> iterable, Collection<? super T> collection) {
            m85414S(iterable, (List) collection);
        }

        /* renamed from: S */
        public static <T> void m85414S(Iterable<T> iterable, List<? super T> list) {
            C18753i1.m86340d(iterable);
            if (iterable instanceof C18818n1) {
                List<?> O = ((C18818n1) iterable).mo55023O();
                C18818n1 n1Var = (C18818n1) list;
                int size = list.size();
                for (Object next : O) {
                    if (next == null) {
                        String str = "Element at index " + (n1Var.size() - size) + " is null.";
                        for (int size2 = n1Var.size() - 1; size2 >= size; size2--) {
                            n1Var.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof ByteString) {
                        n1Var.mo55022N2((ByteString) next);
                    } else {
                        n1Var.add((String) next);
                    }
                }
            } else if (iterable instanceof C18846q2) {
                list.addAll((Collection) iterable);
            } else {
                m85415T(iterable, list);
            }
        }

        /* renamed from: T */
        public static <T> void m85415T(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T next : iterable) {
                if (next == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(next);
            }
        }

        /* renamed from: m0 */
        public static UninitializedMessageException m85416m0(C18920z1 z1Var) {
            return new UninitializedMessageException(z1Var);
        }

        /* renamed from: J3 */
        public boolean mo54260J3(InputStream inputStream, C18836p0 p0Var) throws IOException {
            int read = inputStream.read();
            if (read == -1) {
                return false;
            }
            mo54266Y1(new C18667a(inputStream, C18889w.m87618O(read, inputStream)), p0Var);
            return true;
        }

        /* renamed from: U */
        public abstract BuilderType clone();

        /* renamed from: V */
        public final String mo54262V(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        /* renamed from: X */
        public boolean mo54264X(InputStream inputStream) throws IOException {
            return mo54260J3(inputStream, C18836p0.m87223d());
        }

        /* renamed from: Y */
        public abstract BuilderType mo54013Y(MessageType messagetype);

        /* renamed from: Z */
        public BuilderType mo54258A0(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                C18889w v0 = byteString.mo53766v0();
                mo54259C0(v0);
                v0.mo55500a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(mo54262V("ByteString"), e2);
            }
        }

        /* renamed from: a0 */
        public BuilderType mo54270c2(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
            try {
                C18889w v0 = byteString.mo53766v0();
                mo54010M1(v0, p0Var);
                v0.mo55500a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(mo54262V("ByteString"), e2);
            }
        }

        /* renamed from: b0 */
        public BuilderType mo54259C0(C18889w wVar) throws IOException {
            return mo54010M1(wVar, C18836p0.m87223d());
        }

        /* renamed from: c0 */
        public abstract BuilderType mo54010M1(C18889w wVar, C18836p0 p0Var) throws IOException;

        /* renamed from: d0 */
        public BuilderType mo54276t0(C18920z1 z1Var) {
            if (getDefaultInstanceForType().getClass().isInstance(z1Var)) {
                return mo54013Y((C18665a) z1Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        /* renamed from: g0 */
        public BuilderType mo54261M(InputStream inputStream) throws IOException {
            C18889w j = C18889w.m87622j(inputStream);
            mo54259C0(j);
            j.mo55500a(0);
            return this;
        }

        /* renamed from: h0 */
        public BuilderType mo54266Y1(InputStream inputStream, C18836p0 p0Var) throws IOException {
            C18889w j = C18889w.m87622j(inputStream);
            mo54010M1(j, p0Var);
            j.mo55500a(0);
            return this;
        }

        /* renamed from: i0 */
        public BuilderType mo54263W(byte[] bArr) throws InvalidProtocolBufferException {
            return mo54017f0(bArr, 0, bArr.length);
        }

        /* renamed from: j0 */
        public BuilderType mo54017f0(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            try {
                C18889w q = C18889w.m87629q(bArr, i, i2);
                mo54259C0(q);
                q.mo55500a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(mo54262V("byte array"), e2);
            }
        }

        /* renamed from: k0 */
        public BuilderType mo54009K0(byte[] bArr, int i, int i2, C18836p0 p0Var) throws InvalidProtocolBufferException {
            try {
                C18889w q = C18889w.m87629q(bArr, i, i2);
                mo54010M1(q, p0Var);
                q.mo55500a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(mo54262V("byte array"), e2);
            }
        }

        /* renamed from: l0 */
        public BuilderType mo54265X1(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
            return mo54009K0(bArr, 0, bArr.length, p0Var);
        }

        /* renamed from: androidx.datastore.preferences.protobuf.a$a$a */
        public static final class C18667a extends FilterInputStream {

            /* renamed from: a */
            public int f47774a;

            public C18667a(InputStream inputStream, int i) {
                super(inputStream);
                this.f47774a = i;
            }

            public int available() throws IOException {
                return Math.min(super.available(), this.f47774a);
            }

            public int read() throws IOException {
                if (this.f47774a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f47774a--;
                }
                return read;
            }

            public long skip(long j) throws IOException {
                long skip = super.skip(Math.min(j, (long) this.f47774a));
                if (skip >= 0) {
                    this.f47774a = (int) (((long) this.f47774a) - skip);
                }
                return skip;
            }

            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f47774a;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f47774a -= read;
                }
                return read;
            }
        }
    }
}
