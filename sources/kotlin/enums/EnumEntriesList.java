package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.C11076d0;
import kotlin.C11429q;
import kotlin.C11665v0;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10904b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11429q
@C11665v0(version = "1.8")
@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\r\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006B\u001b\u0012\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014¢\u0006\u0004\b \u0010!J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158BX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, mo22516d2 = {"Lkotlin/enums/EnumEntriesList;", "", "T", "Lkotlin/enums/a;", "Lkotlin/collections/b;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "index", "i", "(I)Ljava/lang/Enum;", "element", "", "h", "(Ljava/lang/Enum;)Z", "r", "(Ljava/lang/Enum;)I", "w", "Lkotlin/Function0;", "", "entriesProvider", "Lkotlin/jvm/functions/a;", "_entries", "[Ljava/lang/Enum;", "e", "()I", "size", "q", "()[Ljava/lang/Enum;", "entries", "<init>", "(Lkotlin/jvm/functions/a;)V", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
final class EnumEntriesList<T extends Enum<T>> extends C10904b<T> implements C11085a<T>, Serializable {
    @C12580l
    private volatile T[] _entries;
    @C12579k
    private final C11289a<T[]> entriesProvider;

    public EnumEntriesList(@C12579k C11289a<T[]> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "entriesProvider");
        this.entriesProvider = aVar;
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(mo22526q());
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        return mo22524h((Enum) obj);
    }

    /* renamed from: e */
    public int mo15650e() {
        return mo22526q().length;
    }

    /* renamed from: h */
    public boolean mo22524h(@C12579k T t) {
        Intrinsics.checkNotNullParameter(t, "element");
        if (((Enum) ArraysKt___ArraysKt.m40121qf(mo22526q(), t.ordinal())) == t) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: i */
    public T get(int i) {
        T[] q = mo22526q();
        C10904b.f28138a.mo22056b(i, q.length);
        return q[i];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return mo22527r((Enum) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return mo22528w((Enum) obj);
    }

    /* renamed from: q */
    public final T[] mo22526q() {
        T[] tArr = this._entries;
        if (tArr != null) {
            return tArr;
        }
        T[] tArr2 = (Enum[]) this.entriesProvider.invoke();
        this._entries = tArr2;
        return tArr2;
    }

    /* renamed from: r */
    public int mo22527r(@C12579k T t) {
        Intrinsics.checkNotNullParameter(t, "element");
        int ordinal = t.ordinal();
        if (((Enum) ArraysKt___ArraysKt.m40121qf(mo22526q(), ordinal)) == t) {
            return ordinal;
        }
        return -1;
    }

    /* renamed from: w */
    public int mo22528w(@C12579k T t) {
        Intrinsics.checkNotNullParameter(t, "element");
        return indexOf(t);
    }
}
