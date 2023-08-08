package kotlinx.serialization.json;

import androidx.exifinterface.media.C19135a;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11520r;
import kotlin.sequences.C11559m;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12440p;
import kotlinx.serialization.C12442r;
import kotlinx.serialization.json.internal.C12366d0;
import kotlinx.serialization.json.internal.C12370f0;
import kotlinx.serialization.json.internal.C12375h0;
import kotlinx.serialization.json.internal.C12390p;
import kotlinx.serialization.json.internal.C12396u;
import kotlinx.serialization.json.internal.C12397v;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.modules.C12434e;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.b0 */
public final class C12346b0 {

    /* renamed from: kotlinx.serialization.json.b0$a */
    public static final class C12347a implements C11559m<T> {

        /* renamed from: a */
        public final /* synthetic */ Iterator f30180a;

        public C12347a(Iterator it) {
            this.f30180a = it;
        }

        @C12579k
        public Iterator<T> iterator() {
            return this.f30180a;
        }
    }

    @C12200d
    /* renamed from: a */
    public static final /* synthetic */ <T> T m49703a(C12341a aVar, InputStream inputStream) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(inputStream, "stream");
        C12434e a = aVar.mo25277a();
        Intrinsics.reifiedOperationMarker(6, C19135a.f48928d5);
        return m49704b(aVar, C12442r.m50317h(a, (C11520r) null), inputStream);
    }

    @C12200d
    /* renamed from: b */
    public static final <T> T m49704b(@C12579k C12341a aVar, @C12579k C12199c<T> cVar, @C12579k InputStream inputStream) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "deserializer");
        Intrinsics.checkNotNullParameter(inputStream, "stream");
        C12366d0 d0Var = new C12366d0(inputStream, (Charset) null, 2, (DefaultConstructorMarker) null);
        T G = new C12370f0(aVar, WriteMode.OBJ, d0Var, cVar.getDescriptor()).mo24870G(cVar);
        d0Var.mo25454v();
        return G;
    }

    @C12200d
    @C12579k
    /* renamed from: c */
    public static final <T> C11559m<T> m49705c(@C12579k C12341a aVar, @C12579k InputStream inputStream, @C12579k C12199c<T> cVar, @C12579k DecodeSequenceMode decodeSequenceMode) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(inputStream, "stream");
        Intrinsics.checkNotNullParameter(cVar, "deserializer");
        Intrinsics.checkNotNullParameter(decodeSequenceMode, "format");
        return SequencesKt__SequencesKt.m44589f(new C12347a(C12390p.m50113a(decodeSequenceMode, aVar, new C12366d0(inputStream, (Charset) null, 2, (DefaultConstructorMarker) null), cVar)));
    }

    @C12200d
    /* renamed from: d */
    public static final /* synthetic */ <T> C11559m<T> m49706d(C12341a aVar, InputStream inputStream, DecodeSequenceMode decodeSequenceMode) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(inputStream, "stream");
        Intrinsics.checkNotNullParameter(decodeSequenceMode, "format");
        C12434e a = aVar.mo25277a();
        Intrinsics.reifiedOperationMarker(6, C19135a.f48928d5);
        return m49705c(aVar, inputStream, C12442r.m50317h(a, (C11520r) null), decodeSequenceMode);
    }

    /* renamed from: e */
    public static /* synthetic */ C11559m m49707e(C12341a aVar, InputStream inputStream, C12199c cVar, DecodeSequenceMode decodeSequenceMode, int i, Object obj) {
        if ((i & 4) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        return m49705c(aVar, inputStream, cVar, decodeSequenceMode);
    }

    /* renamed from: f */
    public static /* synthetic */ C11559m m49708f(C12341a aVar, InputStream inputStream, DecodeSequenceMode decodeSequenceMode, int i, Object obj) {
        if ((i & 2) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(inputStream, "stream");
        Intrinsics.checkNotNullParameter(decodeSequenceMode, "format");
        C12434e a = aVar.mo25277a();
        Intrinsics.reifiedOperationMarker(6, C19135a.f48928d5);
        return m49705c(aVar, inputStream, C12442r.m50317h(a, (C11520r) null), decodeSequenceMode);
    }

    @C12200d
    /* renamed from: g */
    public static final /* synthetic */ <T> void m49709g(C12341a aVar, T t, OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(outputStream, "stream");
        C12434e a = aVar.mo25277a();
        Intrinsics.reifiedOperationMarker(6, C19135a.f48928d5);
        m49710h(aVar, C12442r.m50317h(a, (C11520r) null), t, outputStream);
    }

    @C12200d
    /* renamed from: h */
    public static final <T> void m49710h(@C12579k C12341a aVar, @C12579k C12440p<? super T> pVar, T t, @C12579k OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "serializer");
        Intrinsics.checkNotNullParameter(outputStream, "stream");
        C12397v vVar = new C12397v(outputStream, (Charset) null, 2, (DefaultConstructorMarker) null);
        try {
            new C12375h0((C12396u) vVar, aVar, WriteMode.OBJ, new C12409o[WriteMode.values().length]).mo24908e(pVar, t);
        } finally {
            vVar.mo25543i();
        }
    }
}
