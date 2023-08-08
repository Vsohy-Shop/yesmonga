package kotlinx.serialization.json.internal;

import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlin.text.C11602d;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.v */
public final class C12397v extends C12396u {
    @C12579k

    /* renamed from: c */
    public final Writer f30334c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12397v(@C12579k Writer writer) {
        super(new char[16384]);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f30334c = writer;
    }

    /* renamed from: l */
    public static /* synthetic */ void m50132l(C12397v vVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = vVar.mo25542h();
        }
        vVar.mo25546k(i);
    }

    /* renamed from: g */
    public int mo25541g(int i, int i2) {
        int i3 = i + i2;
        int length = this.f30332a.length;
        if (length > i3) {
            return i;
        }
        mo25546k(i);
        if (i2 > length) {
            this.f30332a = new char[C11479u.m44447u(i3, length * 2)];
        }
        return 0;
    }

    /* renamed from: i */
    public void mo25543i() {
        m50132l(this, 0, 1, (Object) null);
        this.f30334c.flush();
    }

    /* renamed from: k */
    public final void mo25546k(int i) {
        this.f30334c.write(this.f30332a, 0, i);
        mo25544j(0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12397v(@org.jetbrains.annotations.C12579k java.io.OutputStream r2, @org.jetbrains.annotations.C12579k java.nio.charset.Charset r3) {
        /*
            r1 = this;
            java.lang.String r0 = "os"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            r0.<init>(r2, r3)
            boolean r2 = r0 instanceof java.io.BufferedWriter
            if (r2 == 0) goto L_0x0016
            java.io.BufferedWriter r0 = (java.io.BufferedWriter) r0
            goto L_0x001e
        L_0x0016:
            java.io.BufferedWriter r2 = new java.io.BufferedWriter
            r3 = 262144(0x40000, float:3.67342E-40)
            r2.<init>(r0, r3)
            r0 = r2
        L_0x001e:
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C12397v.<init>(java.io.OutputStream, java.nio.charset.Charset):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12397v(OutputStream outputStream, Charset charset, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(outputStream, (i & 2) != 0 ? C11602d.f28868b : charset);
    }
}
