package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.C11665v0;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,134:1\n37#2,2:135\n*S KotlinDebug\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n*L\n131#1:135,2\n*E\n"})
/* renamed from: kotlin.coroutines.jvm.internal.e */
public final class C11068e {

    /* renamed from: a */
    public static final int f28259a = 1;

    /* renamed from: a */
    public static final void m42631a(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }

    /* renamed from: b */
    public static final C11067d m42632b(BaseContinuationImpl baseContinuationImpl) {
        return (C11067d) baseContinuationImpl.getClass().getAnnotation(C11067d.class);
    }

    /* renamed from: c */
    public static final int m42633c(BaseContinuationImpl baseContinuationImpl) {
        Integer num;
        int i;
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            return i - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @C12580l
    @C11314h(name = "getSpilledVariableFieldMapping")
    @C11665v0(version = "1.3")
    /* renamed from: d */
    public static final String[] m42634d(@C12579k BaseContinuationImpl baseContinuationImpl) {
        Intrinsics.checkNotNullParameter(baseContinuationImpl, "<this>");
        C11067d b = m42632b(baseContinuationImpl);
        if (b == null) {
            return null;
        }
        m42631a(1, b.mo22508v());
        ArrayList arrayList = new ArrayList();
        int c = m42633c(baseContinuationImpl);
        int[] i = b.mo22503i();
        int length = i.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i[i2] == c) {
                arrayList.add(b.mo22507s()[i2]);
                arrayList.add(b.mo22506n()[i2]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @C12580l
    @C11314h(name = "getStackTraceElement")
    @C11665v0(version = "1.3")
    /* renamed from: e */
    public static final StackTraceElement m42635e(@C12579k BaseContinuationImpl baseContinuationImpl) {
        int i;
        String str;
        Intrinsics.checkNotNullParameter(baseContinuationImpl, "<this>");
        C11067d b = m42632b(baseContinuationImpl);
        if (b == null) {
            return null;
        }
        m42631a(1, b.mo22508v());
        int c = m42633c(baseContinuationImpl);
        if (c < 0) {
            i = -1;
        } else {
            i = b.mo22504l()[c];
        }
        String b2 = C11070g.f28260a.mo22510b(baseContinuationImpl);
        if (b2 == null) {
            str = b.mo22501c();
        } else {
            str = b2 + '/' + b.mo22501c();
        }
        return new StackTraceElement(str, b.mo22505m(), b.mo22502f(), i);
    }
}
