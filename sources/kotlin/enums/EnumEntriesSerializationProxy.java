package kotlin.enums;

import com.google.firebase.remoteconfig.C33585u;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00060\u0003j\u0002`\u0004:\u0001\u000eB\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0006\u001a\u00020\u0005H\u0002R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, mo22516d2 = {"Lkotlin/enums/EnumEntriesSerializationProxy;", "", "E", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "Ljava/lang/Class;", "c", "Ljava/lang/Class;", "", "entries", "<init>", "([Ljava/lang/Enum;)V", "a", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {
    @C12579k

    /* renamed from: a */
    public static final C11084a f28268a = new C11084a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 0;
    @C12579k

    /* renamed from: c */
    private final Class<E> f28269c;

    /* renamed from: kotlin.enums.EnumEntriesSerializationProxy$a */
    public static final class C11084a {
        public /* synthetic */ C11084a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C11084a() {
        }
    }

    public EnumEntriesSerializationProxy(@C12579k E[] eArr) {
        Intrinsics.checkNotNullParameter(eArr, C33585u.C33588c.f81747z3);
        Class<?> componentType = eArr.getClass().getComponentType();
        Intrinsics.checkNotNull(componentType);
        this.f28269c = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f28269c.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "c.enumConstants");
        return EnumEntriesKt.m42679b((Enum[]) enumConstants);
    }
}
