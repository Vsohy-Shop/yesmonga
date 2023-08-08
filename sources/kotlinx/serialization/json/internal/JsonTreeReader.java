package kotlinx.serialization.json.internal;

import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.C11079d2;
import kotlin.C11094g;
import kotlin.C11098h;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.C12344b;
import kotlinx.serialization.json.C12354g;
import kotlinx.serialization.json.C12403k;
import kotlinx.serialization.json.C12413r;
import kotlinx.serialization.json.C12421x;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.C12579k;

public final class JsonTreeReader {
    @C12579k

    /* renamed from: a */
    public final C12359a f30231a;

    /* renamed from: b */
    public final boolean f30232b;

    /* renamed from: c */
    public int f30233c;

    public JsonTreeReader(@C12579k C12354g gVar, @C12579k C12359a aVar) {
        Intrinsics.checkNotNullParameter(gVar, BannerConfigurableFragment.f27258E0);
        Intrinsics.checkNotNullParameter(aVar, "lexer");
        this.f30231a = aVar;
        this.f30232b = gVar.mo25368n();
    }

    @C12579k
    /* renamed from: e */
    public final C12403k mo25405e() {
        C12403k kVar;
        byte G = this.f30231a.mo25420G();
        if (G == 1) {
            return mo25411k(true);
        }
        if (G == 0) {
            return mo25411k(false);
        }
        if (G == 6) {
            int i = this.f30233c + 1;
            this.f30233c = i;
            if (i == 200) {
                kVar = mo25407g();
            } else {
                kVar = mo25409i();
            }
            this.f30233c--;
            return kVar;
        } else if (G == 8) {
            return mo25406f();
        } else {
            C12359a.m49866x(this.f30231a, Intrinsics.stringPlus("Cannot begin reading element, unexpected token: ", Byte.valueOf(G)), 0, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: f */
    public final C12403k mo25406f() {
        boolean z;
        byte l = this.f30231a.mo25443l();
        if (this.f30231a.mo25420G() != 4) {
            ArrayList arrayList = new ArrayList();
            while (this.f30231a.mo25437f()) {
                arrayList.add(mo25405e());
                l = this.f30231a.mo25443l();
                if (l != 4) {
                    C12359a aVar = this.f30231a;
                    if (l == 9) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int a = aVar.f30240a;
                    if (!z) {
                        aVar.mo25455w("Expected end of the array or comma", a);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            if (l == 8) {
                this.f30231a.mo25444m((byte) 9);
            } else if (l == 4) {
                C12359a.m49866x(this.f30231a, "Unexpected trailing comma", 0, 2, (Object) null);
                throw new KotlinNothingValueException();
            }
            return new C12344b(arrayList);
        }
        C12359a.m49866x(this.f30231a, "Unexpected leading comma", 0, 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: g */
    public final C12403k mo25407g() {
        return (C12403k) C11098h.m42747c(new C11094g(new JsonTreeReader$readDeepRecursive$1(this, (C11045c<? super JsonTreeReader$readDeepRecursive$1>) null)), C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo25408h(kotlin.C11102i<kotlin.C11079d2, kotlinx.serialization.json.C12403k> r19, kotlin.coroutines.C11045c<? super kotlinx.serialization.json.C12403k> r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof kotlinx.serialization.json.internal.JsonTreeReader$readObject$2
            if (r2 == 0) goto L_0x0017
            r2 = r1
            kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 r2 = (kotlinx.serialization.json.internal.JsonTreeReader$readObject$2) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 r2 = new kotlinx.serialization.json.internal.JsonTreeReader$readObject$2
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 7
            r6 = 6
            r7 = 1
            r8 = 0
            r9 = 2
            r10 = 0
            r11 = 4
            if (r4 == 0) goto L_0x0050
            if (r4 != r7) goto L_0x0048
            java.lang.Object r4 = r2.L$3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r12 = r2.L$2
            java.util.LinkedHashMap r12 = (java.util.LinkedHashMap) r12
            java.lang.Object r13 = r2.L$1
            kotlinx.serialization.json.internal.JsonTreeReader r13 = (kotlinx.serialization.json.internal.JsonTreeReader) r13
            java.lang.Object r14 = r2.L$0
            kotlin.i r14 = (kotlin.C11102i) r14
            kotlin.C11661u0.m45747n(r1)
            r16 = r3
            r3 = r2
            r2 = r16
            goto L_0x00a9
        L_0x0048:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0050:
            kotlin.C11661u0.m45747n(r1)
            kotlinx.serialization.json.internal.a r1 = r0.f30231a
            byte r1 = r1.mo25444m(r6)
            kotlinx.serialization.json.internal.a r4 = r0.f30231a
            byte r4 = r4.mo25420G()
            if (r4 == r11) goto L_0x00e8
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r13 = r0
            r12 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r19
        L_0x006d:
            kotlinx.serialization.json.internal.a r14 = r13.f30231a
            boolean r14 = r14.mo25437f()
            if (r14 == 0) goto L_0x00cb
            boolean r2 = r13.f30232b
            if (r2 == 0) goto L_0x0080
            kotlinx.serialization.json.internal.a r2 = r13.f30231a
            java.lang.String r2 = r2.mo25449r()
            goto L_0x0086
        L_0x0080:
            kotlinx.serialization.json.internal.a r2 = r13.f30231a
            java.lang.String r2 = r2.mo25447p()
        L_0x0086:
            kotlinx.serialization.json.internal.a r14 = r13.f30231a
            r15 = 5
            r14.mo25444m(r15)
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            r3.L$0 = r1
            r3.L$1 = r13
            r3.L$2 = r12
            r3.L$3 = r2
            r3.label = r7
            java.lang.Object r14 = r1.mo22532a(r14, r3)
            if (r14 != r4) goto L_0x009f
            return r4
        L_0x009f:
            r16 = r14
            r14 = r1
            r1 = r16
            r17 = r4
            r4 = r2
            r2 = r17
        L_0x00a9:
            kotlinx.serialization.json.k r1 = (kotlinx.serialization.json.C12403k) r1
            r12.put(r4, r1)
            kotlinx.serialization.json.internal.a r1 = r13.f30231a
            byte r1 = r1.mo25443l()
            if (r1 != r11) goto L_0x00ba
            r4 = r2
            r2 = r1
            r1 = r14
            goto L_0x006d
        L_0x00ba:
            if (r1 != r5) goto L_0x00be
            r2 = r1
            goto L_0x00cb
        L_0x00be:
            kotlinx.serialization.json.internal.a r1 = r13.f30231a
            java.lang.String r2 = "Expected end of the object or comma"
            kotlinx.serialization.json.internal.C12359a.m49866x(r1, r2, r10, r9, r8)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
        L_0x00cb:
            if (r2 != r6) goto L_0x00d3
            kotlinx.serialization.json.internal.a r1 = r13.f30231a
            r1.mo25444m(r5)
            goto L_0x00d5
        L_0x00d3:
            if (r2 == r11) goto L_0x00db
        L_0x00d5:
            kotlinx.serialization.json.JsonObject r1 = new kotlinx.serialization.json.JsonObject
            r1.<init>(r12)
            return r1
        L_0x00db:
            kotlinx.serialization.json.internal.a r1 = r13.f30231a
            java.lang.String r2 = "Unexpected trailing comma"
            kotlinx.serialization.json.internal.C12359a.m49866x(r1, r2, r10, r9, r8)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
        L_0x00e8:
            kotlinx.serialization.json.internal.a r1 = r0.f30231a
            java.lang.String r2 = "Unexpected leading comma"
            kotlinx.serialization.json.internal.C12359a.m49866x(r1, r2, r10, r9, r8)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonTreeReader.mo25408h(kotlin.i, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: i */
    public final C12403k mo25409i() {
        String str;
        byte m = this.f30231a.mo25444m((byte) 6);
        if (this.f30231a.mo25420G() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!this.f30231a.mo25437f()) {
                    break;
                }
                if (this.f30232b) {
                    str = this.f30231a.mo25449r();
                } else {
                    str = this.f30231a.mo25447p();
                }
                this.f30231a.mo25444m((byte) 5);
                linkedHashMap.put(str, mo25405e());
                m = this.f30231a.mo25443l();
                if (m != 4) {
                    if (m != 7) {
                        C12359a.m49866x(this.f30231a, "Expected end of the object or comma", 0, 2, (Object) null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            if (m == 6) {
                this.f30231a.mo25444m((byte) 7);
            } else if (m == 4) {
                C12359a.m49866x(this.f30231a, "Unexpected trailing comma", 0, 2, (Object) null);
                throw new KotlinNothingValueException();
            }
            return new JsonObject(linkedHashMap);
        }
        C12359a.m49866x(this.f30231a, "Unexpected leading comma", 0, 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: j */
    public final JsonObject mo25410j(C11289a<? extends C12403k> aVar) {
        String str;
        byte m = this.f30231a.mo25444m((byte) 6);
        if (this.f30231a.mo25420G() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!this.f30231a.mo25437f()) {
                    break;
                }
                if (this.f30232b) {
                    str = this.f30231a.mo25449r();
                } else {
                    str = this.f30231a.mo25447p();
                }
                this.f30231a.mo25444m((byte) 5);
                linkedHashMap.put(str, (C12403k) aVar.invoke());
                m = this.f30231a.mo25443l();
                if (m != 4) {
                    if (m != 7) {
                        C12359a.m49866x(this.f30231a, "Expected end of the object or comma", 0, 2, (Object) null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            if (m == 6) {
                this.f30231a.mo25444m((byte) 7);
            } else if (m == 4) {
                C12359a.m49866x(this.f30231a, "Unexpected trailing comma", 0, 2, (Object) null);
                throw new KotlinNothingValueException();
            }
            return new JsonObject(linkedHashMap);
        }
        C12359a.m49866x(this.f30231a, "Unexpected leading comma", 0, 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: k */
    public final C12421x mo25411k(boolean z) {
        String str;
        if (this.f30232b || !z) {
            str = this.f30231a.mo25449r();
        } else {
            str = this.f30231a.mo25447p();
        }
        if (z || !Intrinsics.areEqual((Object) str, (Object) "null")) {
            return new C12413r(str, z);
        }
        return JsonNull.INSTANCE;
    }
}
