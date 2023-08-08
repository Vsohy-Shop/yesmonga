package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34319a.C34320a;
import com.google.protobuf.C34412l1;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.a */
public abstract class C34319a<MessageType extends C34319a<MessageType, BuilderType>, BuilderType extends C34320a<MessageType, BuilderType>> implements C34412l1 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$b */
    public interface C34322b {
        int getNumber();
    }

    /* renamed from: a */
    private String m138782a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        C34320a.m138785c(iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(ByteString byteString) throws IllegalArgumentException {
        if (!byteString.mo99250s0()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    /* access modifiers changed from: package-private */
    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(C34372g2 g2Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int d = g2Var.mo101117d(this);
        setMemoizedSerializedSize(d);
        return d;
    }

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException((C34412l1) this);
    }

    /* access modifiers changed from: package-private */
    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream n1 = CodedOutputStream.m137393n1(bArr);
            writeTo(n1);
            n1.mo99317Z();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(m138782a("byte array"), e);
        }
    }

    public ByteString toByteString() {
        try {
            ByteString.C34160g u0 = ByteString.m137263u0(getSerializedSize());
            writeTo(u0.mo99269b());
            return u0.mo99268a();
        } catch (IOException e) {
            throw new RuntimeException(m138782a("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        CodedOutputStream k1 = CodedOutputStream.m137387k1(outputStream, CodedOutputStream.m137352J0(CodedOutputStream.m137354L0(serializedSize) + serializedSize));
        k1.mo99318Z1(serializedSize);
        writeTo(k1);
        k1.mo99324e1();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        CodedOutputStream k1 = CodedOutputStream.m137387k1(outputStream, CodedOutputStream.m137352J0(getSerializedSize()));
        writeTo(k1);
        k1.mo99324e1();
    }

    /* renamed from: com.google.protobuf.a$a */
    public static abstract class C34320a<MessageType extends C34319a<MessageType, BuilderType>, BuilderType extends C34320a<MessageType, BuilderType>> implements C34412l1.C34413a {
        /* renamed from: A */
        public static UninitializedMessageException m138783A(C34412l1 l1Var) {
            return new UninitializedMessageException(l1Var);
        }

        @Deprecated
        /* renamed from: b */
        public static <T> void m138784b(Iterable<T> iterable, Collection<? super T> collection) {
            m138785c(iterable, (List) collection);
        }

        /* renamed from: c */
        public static <T> void m138785c(Iterable<T> iterable, List<? super T> list) {
            C34471v0.m140573d(iterable);
            if (iterable instanceof C34324a1) {
                List<?> O = ((C34324a1) iterable).mo100864O();
                C34324a1 a1Var = (C34324a1) list;
                int size = list.size();
                for (Object next : O) {
                    if (next == null) {
                        String str = "Element at index " + (a1Var.size() - size) + " is null.";
                        for (int size2 = a1Var.size() - 1; size2 >= size; size2--) {
                            a1Var.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof ByteString) {
                        a1Var.mo100861D0((ByteString) next);
                    } else {
                        a1Var.add((String) next);
                    }
                }
            } else if (iterable instanceof C34510z1) {
                list.addAll((Collection) iterable);
            } else {
                m138786e(iterable, list);
            }
        }

        /* renamed from: e */
        public static <T> void m138786e(Iterable<T> iterable, List<? super T> list) {
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

        /* renamed from: h */
        private String m138787h(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        /* renamed from: M2 */
        public boolean mo100840M2(InputStream inputStream, C34368g0 g0Var) throws IOException {
            int read = inputStream.read();
            if (read == -1) {
                return false;
            }
            mo100851p0(new C34321a(inputStream, C34448s.m140144O(read, inputStream)), g0Var);
            return true;
        }

        /* renamed from: X */
        public boolean mo100843X(InputStream inputStream) throws IOException {
            return mo100840M2(inputStream, C34368g0.m139242d());
        }

        /* renamed from: f */
        public abstract BuilderType clone();

        /* renamed from: i */
        public abstract BuilderType mo100474i(MessageType messagetype);

        /* renamed from: j */
        public BuilderType mo100847l2(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                C34448s v0 = byteString.mo99254v0();
                mo100848m2(v0);
                v0.mo101527a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(m138787h("ByteString"), e2);
            }
        }

        /* renamed from: k */
        public BuilderType mo100855y2(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            try {
                C34448s v0 = byteString.mo99254v0();
                mo100459G1(v0, g0Var);
                v0.mo101527a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(m138787h("ByteString"), e2);
            }
        }

        /* renamed from: l */
        public BuilderType mo100848m2(C34448s sVar) throws IOException {
            return mo100459G1(sVar, C34368g0.m139242d());
        }

        /* renamed from: m */
        public abstract BuilderType mo100459G1(C34448s sVar, C34368g0 g0Var) throws IOException;

        /* renamed from: n */
        public BuilderType mo100838A1(C34412l1 l1Var) {
            if (getDefaultInstanceForType().getClass().isInstance(l1Var)) {
                return mo100474i((C34319a) l1Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        /* renamed from: o */
        public BuilderType mo100839M(InputStream inputStream) throws IOException {
            C34448s j = C34448s.m140148j(inputStream);
            mo100848m2(j);
            j.mo101527a(0);
            return this;
        }

        /* renamed from: s */
        public BuilderType mo100851p0(InputStream inputStream, C34368g0 g0Var) throws IOException {
            C34448s j = C34448s.m140148j(inputStream);
            mo100459G1(j, g0Var);
            j.mo101527a(0);
            return this;
        }

        /* renamed from: t */
        public BuilderType mo100842W(byte[] bArr) throws InvalidProtocolBufferException {
            return mo100472f0(bArr, 0, bArr.length);
        }

        /* renamed from: u */
        public BuilderType mo100472f0(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            try {
                C34448s q = C34448s.m140155q(bArr, i, i2);
                mo100848m2(q);
                q.mo101527a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(m138787h("byte array"), e2);
            }
        }

        /* renamed from: v */
        public BuilderType mo100470e2(byte[] bArr, int i, int i2, C34368g0 g0Var) throws InvalidProtocolBufferException {
            try {
                C34448s q = C34448s.m140155q(bArr, i, i2);
                mo100459G1(q, g0Var);
                q.mo101527a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(m138787h("byte array"), e2);
            }
        }

        /* renamed from: x */
        public BuilderType mo100841T2(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return mo100470e2(bArr, 0, bArr.length, g0Var);
        }

        /* renamed from: com.google.protobuf.a$a$a */
        public static final class C34321a extends FilterInputStream {

            /* renamed from: a */
            public int f83196a;

            public C34321a(InputStream inputStream, int i) {
                super(inputStream);
                this.f83196a = i;
            }

            public int available() throws IOException {
                return Math.min(super.available(), this.f83196a);
            }

            public int read() throws IOException {
                if (this.f83196a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f83196a--;
                }
                return read;
            }

            public long skip(long j) throws IOException {
                long skip = super.skip(Math.min(j, (long) this.f83196a));
                if (skip >= 0) {
                    this.f83196a = (int) (((long) this.f83196a) - skip);
                }
                return skip;
            }

            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f83196a;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f83196a -= read;
                }
                return read;
            }
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        C34320a.m138785c(iterable, list);
    }
}
