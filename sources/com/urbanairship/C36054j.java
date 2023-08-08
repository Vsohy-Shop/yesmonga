package com.urbanairship;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Handler;
import androidx.annotation.C0359n0;
import com.urbanairship.app.C36030b;
import com.urbanairship.app.C36031c;
import com.urbanairship.app.C36039i;
import com.urbanairship.channel.C9008d;
import com.urbanairship.util.C9669o0;
import java.util.Calendar;

/* renamed from: com.urbanairship.j */
public class C36054j extends C36040b {

    /* renamed from: o */
    public static final long f89076o = 30000;

    /* renamed from: p */
    public static final int f89077p = 6;

    /* renamed from: f */
    public final Context f89078f;

    /* renamed from: g */
    public final AirshipConfigOptions f89079g;

    /* renamed from: h */
    public final C9008d f89080h;

    /* renamed from: i */
    public ClipboardManager f89081i;

    /* renamed from: j */
    public final C36031c f89082j = new C36055a();

    /* renamed from: k */
    public final C36030b f89083k;

    /* renamed from: l */
    public int f89084l;

    /* renamed from: m */
    public long[] f89085m = new long[6];

    /* renamed from: n */
    public boolean f89086n;

    /* renamed from: com.urbanairship.j$a */
    public class C36055a extends C36039i {
        public C36055a() {
        }

        /* renamed from: a */
        public void mo17410a(long j) {
            C36054j.this.mo107807E(j);
        }
    }

    /* renamed from: com.urbanairship.j$b */
    public class C36056b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f89088a;

        public C36056b(String str) {
            this.f89088a = str;
        }

        public void run() {
            C36054j.this.f89081i.setPrimaryClip(ClipData.newPlainText("UA Channel ID", this.f89088a));
            C36059m.m148406b("Channel ID copied to clipboard", new Object[0]);
        }
    }

    public C36054j(@C0359n0 Context context, @C0359n0 AirshipConfigOptions airshipConfigOptions, @C0359n0 C9008d dVar, @C0359n0 C36071u uVar, @C0359n0 C36030b bVar) {
        super(context, uVar);
        this.f89078f = context.getApplicationContext();
        this.f89079g = airshipConfigOptions;
        this.f89080h = dVar;
        this.f89083k = bVar;
    }

    /* renamed from: A */
    public void mo17591A() {
        this.f89083k.mo18481b(this.f89082j);
    }

    /* renamed from: D */
    public final boolean mo107806D() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        for (long j : this.f89085m) {
            if (j + 30000 < timeInMillis) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: E */
    public final void mo107807E(long j) {
        if (mo107808F()) {
            if (this.f89084l >= 6) {
                this.f89084l = 0;
            }
            long[] jArr = this.f89085m;
            int i = this.f89084l;
            jArr[i] = j;
            this.f89084l = i + 1;
            if (mo107806D()) {
                mo107810H();
            }
        }
    }

    /* renamed from: F */
    public boolean mo107808F() {
        return this.f89086n;
    }

    /* renamed from: G */
    public void mo107809G(boolean z) {
        this.f89086n = z;
    }

    /* renamed from: H */
    public final void mo107810H() {
        if (this.f89081i == null) {
            try {
                this.f89081i = (ClipboardManager) this.f89078f.getSystemService("clipboard");
            } catch (Exception e) {
                C36059m.m148411g(e, "Unable to initialize clipboard manager: ", new Object[0]);
            }
        }
        if (this.f89081i == null) {
            C36059m.m148406b("Unable to attempt channel capture, clipboard manager uninitialized", new Object[0]);
            return;
        }
        this.f89085m = new long[6];
        this.f89084l = 0;
        String Z = this.f89080h.mo17793Z();
        String str = "ua:";
        if (!C9669o0.m36224e(Z)) {
            str = str + Z;
        }
        try {
            new Handler(C36045e.m148371a()).post(new C36056b(str));
        } catch (Exception e2) {
            C36059m.m148423s(e2, "Channel capture failed! Unable to copy Channel ID to clipboard.", new Object[0]);
        }
    }

    /* renamed from: r */
    public void mo17625r() {
        super.mo17625r();
        this.f89086n = this.f89079g.f87147t;
        this.f89083k.mo18485f(this.f89082j);
    }
}
