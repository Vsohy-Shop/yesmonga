package kotlinx.serialization.modules;

import com.urbanairship.analytics.location.C35560b;
import java.util.List;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.modules.a */
public abstract class C12428a {

    /* renamed from: kotlinx.serialization.modules.a$a */
    public static final class C12429a extends C12428a {
        @C12579k

        /* renamed from: a */
        public final C12248g<?> f30366a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12429a(@C12579k C12248g<?> gVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(gVar, "serializer");
            this.f30366a = gVar;
        }

        @C12579k
        /* renamed from: a */
        public C12248g<?> mo25569a(@C12579k List<? extends C12248g<?>> list) {
            Intrinsics.checkNotNullParameter(list, "typeArgumentsSerializers");
            return this.f30366a;
        }

        @C12579k
        /* renamed from: b */
        public final C12248g<?> mo25570b() {
            return this.f30366a;
        }

        public boolean equals(@C12580l Object obj) {
            return (obj instanceof C12429a) && Intrinsics.areEqual((Object) ((C12429a) obj).f30366a, (Object) this.f30366a);
        }

        public int hashCode() {
            return this.f30366a.hashCode();
        }
    }

    /* renamed from: kotlinx.serialization.modules.a$b */
    public static final class C12430b extends C12428a {
        @C12579k

        /* renamed from: a */
        public final C11300l<List<? extends C12248g<?>>, C12248g<?>> f30367a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12430b(@C12579k C11300l<? super List<? extends C12248g<?>>, ? extends C12248g<?>> lVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(lVar, C35560b.f87807Z0);
            this.f30367a = lVar;
        }

        @C12579k
        /* renamed from: a */
        public C12248g<?> mo25569a(@C12579k List<? extends C12248g<?>> list) {
            Intrinsics.checkNotNullParameter(list, "typeArgumentsSerializers");
            return this.f30367a.invoke(list);
        }

        @C12579k
        /* renamed from: b */
        public final C11300l<List<? extends C12248g<?>>, C12248g<?>> mo25573b() {
            return this.f30367a;
        }
    }

    public /* synthetic */ C12428a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @C12579k
    /* renamed from: a */
    public abstract C12248g<?> mo25569a(@C12579k List<? extends C12248g<?>> list);

    public C12428a() {
    }
}
