package p073j$.time.format;

import java.util.function.Consumer;
import p073j$.time.chrono.Chronology;

/* renamed from: j$.time.format.p */
public final /* synthetic */ class C42642p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C42643q f107886a;

    /* renamed from: b */
    public final /* synthetic */ C42649w f107887b;

    /* renamed from: c */
    public final /* synthetic */ long f107888c;

    /* renamed from: d */
    public final /* synthetic */ int f107889d;

    /* renamed from: e */
    public final /* synthetic */ int f107890e;

    public /* synthetic */ C42642p(C42643q qVar, C42649w wVar, long j, int i, int i2) {
        this.f107886a = qVar;
        this.f107887b = wVar;
        this.f107888c = j;
        this.f107889d = i;
        this.f107890e = i2;
    }

    public final void accept(Object obj) {
        Chronology chronology = (Chronology) obj;
        this.f107886a.mo138145d(this.f107887b, this.f107888c, this.f107889d, this.f107890e);
    }
}
