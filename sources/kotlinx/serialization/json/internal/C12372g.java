package kotlinx.serialization.json.internal;

import com.usabilla.sdk.ubform.net.C9851c;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.g */
public class C12372g {
    @C12579k
    @C11287e

    /* renamed from: a */
    public final C12396u f30301a;

    /* renamed from: b */
    public boolean f30302b = true;

    public C12372g(@C12579k C12396u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "sb");
        this.f30301a = uVar;
    }

    /* renamed from: a */
    public final boolean mo25507a() {
        return this.f30302b;
    }

    /* renamed from: b */
    public void mo25508b() {
        this.f30302b = true;
    }

    /* renamed from: c */
    public void mo25509c() {
        this.f30302b = false;
    }

    /* renamed from: d */
    public void mo25510d(byte b) {
        this.f30301a.mo25536b((long) b);
    }

    /* renamed from: e */
    public final void mo25511e(char c) {
        this.f30301a.mo25535a(c);
    }

    /* renamed from: f */
    public void mo25512f(double d) {
        this.f30301a.mo25537c(String.valueOf(d));
    }

    /* renamed from: g */
    public void mo25513g(float f) {
        this.f30301a.mo25537c(String.valueOf(f));
    }

    /* renamed from: h */
    public void mo25514h(int i) {
        this.f30301a.mo25536b((long) i);
    }

    /* renamed from: i */
    public void mo25515i(long j) {
        this.f30301a.mo25536b(j);
    }

    /* renamed from: j */
    public final void mo25516j(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C9851c.f26937h);
        this.f30301a.mo25537c(str);
    }

    /* renamed from: k */
    public void mo25517k(short s) {
        this.f30301a.mo25536b((long) s);
    }

    /* renamed from: l */
    public void mo25518l(boolean z) {
        this.f30301a.mo25537c(String.valueOf(z));
    }

    /* renamed from: m */
    public final void mo25519m(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.f30301a.mo25538d(str);
    }

    /* renamed from: n */
    public final void mo25520n(boolean z) {
        this.f30302b = z;
    }

    /* renamed from: o */
    public void mo25521o() {
    }

    /* renamed from: p */
    public void mo25522p() {
    }
}
