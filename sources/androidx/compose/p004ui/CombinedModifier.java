package androidx.compose.p004ui;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.CombinedModifier */
public final class CombinedModifier implements C8767m {

    /* renamed from: c */
    public static final int f23337c = 0;
    @C12579k

    /* renamed from: a */
    public final C8767m f23338a;
    @C12579k

    /* renamed from: b */
    public final C8767m f23339b;

    public CombinedModifier(@C12579k C8767m mVar, @C12579k C8767m mVar2) {
        Intrinsics.checkNotNullParameter(mVar, "outer");
        Intrinsics.checkNotNullParameter(mVar2, "inner");
        this.f23338a = mVar;
        this.f23339b = mVar2;
    }

    /* renamed from: A */
    public boolean mo17001A(@C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        if (!this.f23338a.mo17001A(lVar) || !this.f23339b.mo17001A(lVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    public boolean mo17002T(@C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        if (this.f23338a.mo17002T(lVar) || this.f23339b.mo17002T(lVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public <R> R mo17003Z(R r, @C12579k C11304p<? super C8767m.C8770c, ? super R, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "operation");
        return this.f23338a.mo17003Z(this.f23339b.mo17003Z(r, pVar), pVar);
    }

    @C12579k
    /* renamed from: a */
    public final C8767m mo17004a() {
        return this.f23339b;
    }

    @C12579k
    /* renamed from: b */
    public final C8767m mo17005b() {
        return this.f23338a;
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof CombinedModifier) {
            CombinedModifier combinedModifier = (CombinedModifier) obj;
            return Intrinsics.areEqual((Object) this.f23338a, (Object) combinedModifier.f23338a) && Intrinsics.areEqual((Object) this.f23339b, (Object) combinedModifier.f23339b);
        }
    }

    public int hashCode() {
        return this.f23338a.hashCode() + (this.f23339b.hashCode() * 31);
    }

    @C12579k
    public String toString() {
        return C12361b.f30260k + ((String) mo17009w("", CombinedModifier$toString$1.f23340f)) + C12361b.f30261l;
    }

    /* renamed from: w */
    public <R> R mo17009w(R r, @C12579k C11304p<? super R, ? super C8767m.C8770c, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "operation");
        return this.f23339b.mo17009w(this.f23338a.mo17009w(r, pVar), pVar);
    }
}
