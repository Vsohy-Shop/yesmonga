package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14218ba;
import com.contentsquare.android.sdk.C14288e1;
import com.contentsquare.android.sdk.C14288e1.C14289a;
import com.contentsquare.android.sdk.C14719t0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.contentsquare.android.sdk.e1 */
public abstract class C14288e1<MessageType extends C14288e1<MessageType, BuilderType>, BuilderType extends C14289a<MessageType, BuilderType>> implements C14218ba {

    /* renamed from: a */
    public int f35282a = 0;

    /* renamed from: com.contentsquare.android.sdk.e1$a */
    public static abstract class C14289a<MessageType extends C14288e1<MessageType, BuilderType>, BuilderType extends C14289a<MessageType, BuilderType>> implements C14218ba.C14219a {
        /* renamed from: e */
        public static <T> void m61440e(Iterable<T> iterable, List<? super T> list) {
            C14566o3.m62804f(iterable);
            if (iterable instanceof C14308ec) {
                List<?> b = ((C14308ec) iterable).mo35079b();
                C14308ec ecVar = (C14308ec) list;
                int size = list.size();
                for (Object next : b) {
                    if (next == null) {
                        String str = "Element at index " + (ecVar.size() - size) + " is null.";
                        for (int size2 = ecVar.size() - 1; size2 >= size; size2--) {
                            ecVar.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof C14719t0) {
                        ecVar.mo35080q0((C14719t0) next);
                    } else {
                        ecVar.add((String) next);
                    }
                }
            } else if (iterable instanceof C14548n9) {
                list.addAll((Collection) iterable);
            } else {
                m61441h(iterable, list);
            }
        }

        /* renamed from: h */
        public static <T> void m61441h(Iterable<T> iterable, List<? super T> list) {
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

        /* renamed from: i */
        public static C14189ae m61442i(C14218ba baVar) {
            return new C14189ae(baVar);
        }

        /* renamed from: c */
        public abstract BuilderType mo35019c(MessageType messagetype);

        /* renamed from: f */
        public BuilderType mo34702j1(C14218ba baVar) {
            if (mo35313Y().getClass().isInstance(baVar)) {
                return mo35019c((C14288e1) baVar);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* renamed from: f */
    public static <T> void m61432f(Iterable<T> iterable, List<? super T> list) {
        C14289a.m61440e(iterable, list);
    }

    /* renamed from: c */
    public int mo35013c(C14398h8 h8Var) {
        int g = mo35016g();
        if (g != -1) {
            return g;
        }
        int d = h8Var.mo35215d(this);
        mo35015e(d);
        return d;
    }

    /* renamed from: d */
    public final String mo35014d(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* renamed from: e */
    public void mo35015e(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public int mo35016g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public C14189ae mo35017h() {
        return new C14189ae(this);
    }

    /* renamed from: i */
    public C14719t0 mo34699i() {
        try {
            C14719t0.C14727h k0 = C14719t0.m63435k0(mo34698c());
            mo34697b(k0.mo36455b());
            return k0.mo36454a();
        } catch (IOException e) {
            throw new RuntimeException(mo35014d("ByteString"), e);
        }
    }

    /* renamed from: k */
    public byte[] mo35018k() {
        try {
            byte[] bArr = new byte[mo34698c()];
            C14235c1 J = C14235c1.m61161J(bArr);
            mo34697b(J);
            J.mo34781L();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(mo35014d("byte array"), e);
        }
    }
}
