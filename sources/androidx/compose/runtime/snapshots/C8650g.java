package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.runtime.snapshots.g */
public abstract class C8650g {

    /* renamed from: a */
    public static final int f23204a = 0;

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.runtime.snapshots.g$a */
    public static final class C8651a extends C8650g {

        /* renamed from: c */
        public static final int f23205c = 8;
        @C12579k

        /* renamed from: b */
        public final C8646f f23206b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8651a(@C12579k C8646f fVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(fVar, "snapshot");
            this.f23206b = fVar;
        }

        /* renamed from: a */
        public void mo16636a() {
            this.f23206b.mo16415d();
            throw new SnapshotApplyConflictException(this.f23206b);
        }

        /* renamed from: b */
        public boolean mo16637b() {
            return false;
        }

        @C12579k
        /* renamed from: c */
        public final C8646f mo16638c() {
            return this.f23206b;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.runtime.snapshots.g$b */
    public static final class C8652b extends C8650g {
        @C12579k

        /* renamed from: b */
        public static final C8652b f23207b = new C8652b();

        /* renamed from: c */
        public static final int f23208c = 0;

        public C8652b() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public void mo16636a() {
        }

        /* renamed from: b */
        public boolean mo16637b() {
            return true;
        }
    }

    public /* synthetic */ C8650g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract void mo16636a();

    /* renamed from: b */
    public abstract boolean mo16637b();

    public C8650g() {
    }
}
