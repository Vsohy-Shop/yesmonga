package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C41930e8;
import com.google.android.gms.internal.measurement.C41948f8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.f8 */
public abstract class C41948f8<MessageType extends C41948f8<MessageType, BuilderType>, BuilderType extends C41930e8<MessageType, BuilderType>> implements C42246wa {
    protected int zzb = 0;

    /* renamed from: d */
    public static void m169878d(Iterable iterable, List list) {
        byte[] bArr = C41860aa.f105998d;
        iterable.getClass();
        if (iterable instanceof C41932ea) {
            List j = ((C41932ea) iterable).mo136696j();
            C41932ea eaVar = (C41932ea) list;
            int size = list.size();
            for (Object next : j) {
                if (next == null) {
                    String str = "Element at index " + (eaVar.size() - size) + " is null.";
                    int size2 = eaVar.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            eaVar.remove(size2);
                        } else {
                            throw new NullPointerException(str);
                        }
                    }
                } else if (next instanceof zzka) {
                    eaVar.mo136697j2((zzka) next);
                } else {
                    eaVar.add((String) next);
                }
            }
        } else if (!(iterable instanceof C41915db)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 >= size3) {
                            list.remove(size4);
                        } else {
                            throw new NullPointerException(str2);
                        }
                    }
                } else {
                    list.add(next2);
                }
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    /* renamed from: a */
    public int mo136761a(C41987hb hbVar) {
        throw null;
    }

    /* renamed from: g */
    public final byte[] mo136762g() {
        try {
            int b = mo137271b();
            byte[] bArr = new byte[b];
            C42295z8 A = C42295z8.m171209A(bArr, 0, b);
            mo137273e(A);
            A.mo137495a();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: h */
    public final zzka mo136763h() {
        try {
            int b = mo137271b();
            zzka zzka = zzka.f106708a;
            byte[] bArr = new byte[b];
            C42295z8 A = C42295z8.m171209A(bArr, 0, b);
            mo137273e(A);
            A.mo137495a();
            return new zzjx(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
