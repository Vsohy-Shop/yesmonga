package kotlinx.serialization.modules;

import java.util.List;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12440p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.modules.e */
public abstract class C12434e {
    public /* synthetic */ C12434e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: d */
    public static /* synthetic */ C12248g m50280d(C12434e eVar, C11494d dVar, List list, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                list = CollectionsKt__CollectionsKt.m40441E();
            }
            return eVar.mo25579c(dVar, list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
    }

    @C12200d
    /* renamed from: a */
    public abstract void mo25578a(@C12579k SerializersModuleCollector serializersModuleCollector);

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of overload with default parameter", replaceWith = @C11587t0(expression = "getContextual(kclass)", imports = {}))
    @C12200d
    /* renamed from: b */
    public final /* synthetic */ C12248g mo25582b(C11494d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "kclass");
        return mo25579c(dVar, CollectionsKt__CollectionsKt.m40441E());
    }

    @C12580l
    @C12200d
    /* renamed from: c */
    public abstract <T> C12248g<T> mo25579c(@C12579k C11494d<T> dVar, @C12579k List<? extends C12248g<?>> list);

    @C12580l
    @C12200d
    /* renamed from: e */
    public abstract <T> C12199c<? extends T> mo25580e(@C12579k C11494d<? super T> dVar, @C12580l String str);

    @C12580l
    @C12200d
    /* renamed from: f */
    public abstract <T> C12440p<T> mo25581f(@C12579k C11494d<? super T> dVar, @C12579k T t);

    public C12434e() {
    }
}
