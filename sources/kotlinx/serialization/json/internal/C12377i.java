package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.C12341a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.i */
public final class C12377i extends C12372g {
    @C12579k

    /* renamed from: c */
    public final C12341a f30311c;

    /* renamed from: d */
    public int f30312d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12377i(@C12579k C12396u uVar, @C12579k C12341a aVar) {
        super(uVar);
        Intrinsics.checkNotNullParameter(uVar, "sb");
        Intrinsics.checkNotNullParameter(aVar, "json");
        this.f30311c = aVar;
    }

    /* renamed from: b */
    public void mo25508b() {
        mo25520n(true);
        this.f30312d++;
    }

    /* renamed from: c */
    public void mo25509c() {
        int i = 0;
        mo25520n(false);
        mo25516j("\n");
        int i2 = this.f30312d;
        while (i < i2) {
            i++;
            mo25516j(this.f30311c.mo25282h().mo25365j());
        }
    }

    /* renamed from: o */
    public void mo25521o() {
        mo25511e(' ');
    }

    /* renamed from: p */
    public void mo25522p() {
        this.f30312d--;
    }
}
