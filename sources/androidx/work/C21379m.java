package androidx.work;

import androidx.work.C21414w;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.m */
public final class C21379m extends C21414w {
    @C12579k

    /* renamed from: h */
    public static final C21381b f55124h = new C21381b((DefaultConstructorMarker) null);

    /* renamed from: androidx.work.m$a */
    public static final class C21380a extends C21414w.C21415a<C21380a, C21379m> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21380a(@C12579k Class<? extends C21372k> cls) {
            super(cls);
            Intrinsics.checkNotNullParameter(cls, "workerClass");
            mo63866h().f54807d = OverwritingInputMerger.class.getName();
        }

        @C12579k
        /* renamed from: A */
        public C21379m mo63787c() {
            boolean z;
            if (!mo63863d() || !mo63866h().f54813j.mo63133h()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new C21379m(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        }

        @C12579k
        /* renamed from: B */
        public C21380a mo63788g() {
            return this;
        }

        @C12579k
        /* renamed from: C */
        public final C21380a mo63786C(@C12579k Class<? extends C21097i> cls) {
            Intrinsics.checkNotNullParameter(cls, "inputMerger");
            mo63866h().f54807d = cls.getName();
            return this;
        }
    }

    /* renamed from: androidx.work.m$b */
    public static final class C21381b {
        public /* synthetic */ C21381b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C21379m mo63789a(@C12579k Class<? extends C21372k> cls) {
            Intrinsics.checkNotNullParameter(cls, "workerClass");
            return (C21379m) new C21380a(cls).mo63862b();
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final List<C21379m> mo63790b(@C12579k List<? extends Class<? extends C21372k>> list) {
            Intrinsics.checkNotNullParameter(list, "workerClasses");
            Iterable<Class> iterable = list;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (Class aVar : iterable) {
                arrayList.add((C21379m) new C21380a(aVar).mo63862b());
            }
            return arrayList;
        }

        public C21381b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21379m(@C12579k C21380a aVar) {
        super(aVar.mo63864e(), aVar.mo63866h(), aVar.mo63865f());
        Intrinsics.checkNotNullParameter(aVar, "builder");
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C21379m m98605e(@C12579k Class<? extends C21372k> cls) {
        return f55124h.mo63789a(cls);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final List<C21379m> m98606f(@C12579k List<? extends Class<? extends C21372k>> list) {
        return f55124h.mo63790b(list);
    }
}
