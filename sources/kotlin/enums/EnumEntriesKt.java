package kotlin.enums;

import com.google.firebase.remoteconfig.C33585u;
import kotlin.C11429q;
import kotlin.C11532s0;
import kotlin.C11665v0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class EnumEntriesKt {
    @C11429q
    @C11665v0(version = "1.8")
    @C12579k
    @C11532s0
    /* renamed from: a */
    public static final <E extends Enum<E>> C11085a<E> m42678a(@C12579k C11289a<E[]> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "entriesProvider");
        return new EnumEntriesList(aVar);
    }

    @C11429q
    @C11665v0(version = "1.8")
    @C12579k
    @C11532s0
    /* renamed from: b */
    public static final <E extends Enum<E>> C11085a<E> m42679b(@C12579k E[] eArr) {
        Intrinsics.checkNotNullParameter(eArr, C33585u.C33588c.f81747z3);
        EnumEntriesList enumEntriesList = new EnumEntriesList(new EnumEntriesKt$enumEntries$1(eArr));
        enumEntriesList.size();
        return enumEntriesList;
    }
}
