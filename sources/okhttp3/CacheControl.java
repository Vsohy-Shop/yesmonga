package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 !2\u00020\u0001:\u0002 !Bq\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0016J\r\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0017J\r\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0018J\r\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001aJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000e\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\r\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u000b\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\f\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0013\u0010\n\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u000e\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013R\u0013\u0010\r\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0013\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014¨\u0006\""}, mo22516d2 = {"Lokhttp3/CacheControl;", "", "noCache", "", "noStore", "maxAgeSeconds", "", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "headerValue", "", "(ZZIIZZZIIZZZLjava/lang/String;)V", "()Z", "()I", "-deprecated_immutable", "-deprecated_maxAgeSeconds", "-deprecated_maxStaleSeconds", "-deprecated_minFreshSeconds", "-deprecated_mustRevalidate", "-deprecated_noCache", "-deprecated_noStore", "-deprecated_noTransform", "-deprecated_onlyIfCached", "-deprecated_sMaxAgeSeconds", "toString", "Builder", "Companion", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class CacheControl {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    @C11287e
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();
    @C12579k
    @C11287e
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    @C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0003\u001a\u00020\u0000J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u0000J\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo22516d2 = {"Lokhttp3/CacheControl$Builder;", "", "()V", "immutable", "", "maxAgeSeconds", "", "maxStaleSeconds", "minFreshSeconds", "noCache", "noStore", "noTransform", "onlyIfCached", "build", "Lokhttp3/CacheControl;", "maxAge", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "maxStale", "minFresh", "clampToInt", "", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j) {
            if (j > ((long) Integer.MAX_VALUE)) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        @C12579k
        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, (String) null, (DefaultConstructorMarker) null);
        }

        @C12579k
        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        @C12579k
        public final Builder maxAge(int i, @C12579k TimeUnit timeUnit) {
            boolean z;
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.maxAgeSeconds = clampToInt(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(("maxAge < 0: " + i).toString());
        }

        @C12579k
        public final Builder maxStale(int i, @C12579k TimeUnit timeUnit) {
            boolean z;
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.maxStaleSeconds = clampToInt(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i).toString());
        }

        @C12579k
        public final Builder minFresh(int i, @C12579k TimeUnit timeUnit) {
            boolean z;
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.minFreshSeconds = clampToInt(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(("minFresh < 0: " + i).toString());
        }

        @C12579k
        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        @C12579k
        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        @C12579k
        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        @C12579k
        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    @C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo22516d2 = {"Lokhttp3/CacheControl$Companion;", "", "()V", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "parse", "headers", "Lokhttp3/Headers;", "indexOfElement", "", "", "characters", "startIndex", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        private final int indexOfElement(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (StringsKt__StringsKt.contains$default((CharSequence) str2, str.charAt(i), false, 2, (Object) null)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.indexOfElement(str, str2, i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00dd  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
        @org.jetbrains.annotations.C12579k
        @kotlin.jvm.C11384m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.CacheControl parse(@org.jetbrains.annotations.C12579k okhttp3.Headers r32) {
            /*
                r31 = this;
                r0 = r31
                r1 = r32
                java.lang.String r2 = "headers"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                int r2 = r32.size()
                r5 = 1
                r8 = r5
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0023:
                if (r7 >= r2) goto L_0x0186
                java.lang.String r3 = r1.name(r7)
                java.lang.String r6 = r1.value(r7)
                java.lang.String r4 = "Cache-Control"
                boolean r4 = kotlin.text.C11622t.equals(r3, r4, r5)
                if (r4 == 0) goto L_0x003a
                if (r9 == 0) goto L_0x0038
                goto L_0x0042
            L_0x0038:
                r9 = r6
                goto L_0x0043
            L_0x003a:
                java.lang.String r4 = "Pragma"
                boolean r3 = kotlin.text.C11622t.equals(r3, r4, r5)
                if (r3 == 0) goto L_0x017b
            L_0x0042:
                r8 = 0
            L_0x0043:
                r3 = 0
            L_0x0044:
                int r4 = r6.length()
                if (r3 >= r4) goto L_0x0176
                java.lang.String r4 = "=,;"
                int r4 = r0.indexOfElement(r6, r4, r3)
                java.lang.String r3 = r6.substring(r3, r4)
                java.lang.String r5 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
                if (r3 == 0) goto L_0x0170
                java.lang.CharSequence r3 = kotlin.text.StringsKt__StringsKt.trim(r3)
                java.lang.String r3 = r3.toString()
                r29 = r2
                int r2 = r6.length()
                if (r4 == r2) goto L_0x00cf
                char r2 = r6.charAt(r4)
                r30 = r8
                r8 = 44
                if (r2 == r8) goto L_0x00d1
                char r2 = r6.charAt(r4)
                r8 = 59
                if (r2 != r8) goto L_0x0080
                goto L_0x00d1
            L_0x0080:
                int r4 = r4 + 1
                int r2 = okhttp3.internal.Util.indexOfNonWhitespace(r6, r4)
                int r4 = r6.length()
                if (r2 >= r4) goto L_0x00b1
                char r4 = r6.charAt(r2)
                r8 = 34
                if (r4 != r8) goto L_0x00b1
                int r2 = r2 + 1
                r24 = 34
                r26 = 0
                r27 = 4
                r28 = 0
                r23 = r6
                r25 = r2
                int r1 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r23, (char) r24, (int) r25, (boolean) r26, (int) r27, (java.lang.Object) r28)
                java.lang.String r2 = r6.substring(r2, r1)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
                r4 = 1
                int r1 = r1 + r4
                r4 = r1
                goto L_0x00d4
            L_0x00b1:
                java.lang.String r4 = ",;"
                int r4 = r0.indexOfElement(r6, r4, r2)
                java.lang.String r2 = r6.substring(r2, r4)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
                if (r2 == 0) goto L_0x00c9
                java.lang.CharSequence r1 = kotlin.text.StringsKt__StringsKt.trim(r2)
                java.lang.String r2 = r1.toString()
                goto L_0x00d4
            L_0x00c9:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                r2.<init>(r1)
                throw r2
            L_0x00cf:
                r30 = r8
            L_0x00d1:
                int r4 = r4 + 1
                r2 = 0
            L_0x00d4:
                java.lang.String r1 = "no-cache"
                r5 = 1
                boolean r1 = kotlin.text.C11622t.equals(r1, r3, r5)
                if (r1 == 0) goto L_0x00e1
                r10 = r5
            L_0x00de:
                r8 = -1
                goto L_0x0167
            L_0x00e1:
                java.lang.String r1 = "no-store"
                boolean r1 = kotlin.text.C11622t.equals(r1, r3, r5)
                if (r1 == 0) goto L_0x00eb
                r11 = r5
                goto L_0x00de
            L_0x00eb:
                java.lang.String r1 = "max-age"
                boolean r1 = kotlin.text.C11622t.equals(r1, r3, r5)
                if (r1 == 0) goto L_0x00fb
                r1 = -1
                int r12 = okhttp3.internal.Util.toNonNegativeInt(r2, r1)
            L_0x00f8:
                r8 = r1
                goto L_0x0167
            L_0x00fb:
                r1 = -1
                java.lang.String r8 = "s-maxage"
                boolean r8 = kotlin.text.C11622t.equals(r8, r3, r5)
                if (r8 == 0) goto L_0x0109
                int r13 = okhttp3.internal.Util.toNonNegativeInt(r2, r1)
                goto L_0x00f8
            L_0x0109:
                java.lang.String r1 = "private"
                boolean r1 = kotlin.text.C11622t.equals(r1, r3, r5)
                if (r1 == 0) goto L_0x0113
                r14 = r5
                goto L_0x00de
            L_0x0113:
                java.lang.String r1 = "public"
                boolean r1 = kotlin.text.C11622t.equals(r1, r3, r5)
                if (r1 == 0) goto L_0x011d
                r15 = r5
                goto L_0x00de
            L_0x011d:
                java.lang.String r1 = "must-revalidate"
                boolean r1 = kotlin.text.C11622t.equals(r1, r3, r5)
                if (r1 == 0) goto L_0x0128
                r16 = r5
                goto L_0x00de
            L_0x0128:
                java.lang.String r1 = "max-stale"
                boolean r1 = kotlin.text.C11622t.equals(r1, r3, r5)
                if (r1 == 0) goto L_0x0138
                r1 = 2147483647(0x7fffffff, float:NaN)
                int r17 = okhttp3.internal.Util.toNonNegativeInt(r2, r1)
                goto L_0x00de
            L_0x0138:
                java.lang.String r1 = "min-fresh"
                boolean r1 = kotlin.text.C11622t.equals(r1, r3, r5)
                if (r1 == 0) goto L_0x0146
                r8 = -1
                int r18 = okhttp3.internal.Util.toNonNegativeInt(r2, r8)
                goto L_0x0167
            L_0x0146:
                r8 = -1
                java.lang.String r1 = "only-if-cached"
                boolean r1 = kotlin.text.C11622t.equals(r1, r3, r5)
                if (r1 == 0) goto L_0x0152
                r19 = r5
                goto L_0x0167
            L_0x0152:
                java.lang.String r1 = "no-transform"
                boolean r1 = kotlin.text.C11622t.equals(r1, r3, r5)
                if (r1 == 0) goto L_0x015d
                r20 = r5
                goto L_0x0167
            L_0x015d:
                java.lang.String r1 = "immutable"
                boolean r1 = kotlin.text.C11622t.equals(r1, r3, r5)
                if (r1 == 0) goto L_0x0167
                r21 = r5
            L_0x0167:
                r1 = r32
                r3 = r4
                r2 = r29
                r8 = r30
                goto L_0x0044
            L_0x0170:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                r2.<init>(r1)
                throw r2
            L_0x0176:
                r29 = r2
                r30 = r8
                goto L_0x017d
            L_0x017b:
                r29 = r2
            L_0x017d:
                r1 = -1
                int r7 = r7 + 1
                r1 = r32
                r2 = r29
                goto L_0x0023
            L_0x0186:
                if (r8 != 0) goto L_0x018b
                r22 = 0
                goto L_0x018d
            L_0x018b:
                r22 = r9
            L_0x018d:
                okhttp3.CacheControl r1 = new okhttp3.CacheControl
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.parse(okhttp3.Headers):okhttp3.CacheControl");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.immutable = z8;
        this.headerValue = str;
    }

    @C12579k
    @C11384m
    public static final CacheControl parse(@C12579k Headers headers) {
        return Companion.parse(headers);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "immutable", imports = {}))
    @C11314h(name = "-deprecated_immutable")
    /* renamed from: -deprecated_immutable  reason: not valid java name */
    public final boolean m172601deprecated_immutable() {
        return this.immutable;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "maxAgeSeconds", imports = {}))
    @C11314h(name = "-deprecated_maxAgeSeconds")
    /* renamed from: -deprecated_maxAgeSeconds  reason: not valid java name */
    public final int m172602deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "maxStaleSeconds", imports = {}))
    @C11314h(name = "-deprecated_maxStaleSeconds")
    /* renamed from: -deprecated_maxStaleSeconds  reason: not valid java name */
    public final int m172603deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "minFreshSeconds", imports = {}))
    @C11314h(name = "-deprecated_minFreshSeconds")
    /* renamed from: -deprecated_minFreshSeconds  reason: not valid java name */
    public final int m172604deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "mustRevalidate", imports = {}))
    @C11314h(name = "-deprecated_mustRevalidate")
    /* renamed from: -deprecated_mustRevalidate  reason: not valid java name */
    public final boolean m172605deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "noCache", imports = {}))
    @C11314h(name = "-deprecated_noCache")
    /* renamed from: -deprecated_noCache  reason: not valid java name */
    public final boolean m172606deprecated_noCache() {
        return this.noCache;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "noStore", imports = {}))
    @C11314h(name = "-deprecated_noStore")
    /* renamed from: -deprecated_noStore  reason: not valid java name */
    public final boolean m172607deprecated_noStore() {
        return this.noStore;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "noTransform", imports = {}))
    @C11314h(name = "-deprecated_noTransform")
    /* renamed from: -deprecated_noTransform  reason: not valid java name */
    public final boolean m172608deprecated_noTransform() {
        return this.noTransform;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "onlyIfCached", imports = {}))
    @C11314h(name = "-deprecated_onlyIfCached")
    /* renamed from: -deprecated_onlyIfCached  reason: not valid java name */
    public final boolean m172609deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "sMaxAgeSeconds", imports = {}))
    @C11314h(name = "-deprecated_sMaxAgeSeconds")
    /* renamed from: -deprecated_sMaxAgeSeconds  reason: not valid java name */
    public final int m172610deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @C11314h(name = "immutable")
    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    @C11314h(name = "maxAgeSeconds")
    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @C11314h(name = "maxStaleSeconds")
    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @C11314h(name = "minFreshSeconds")
    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @C11314h(name = "mustRevalidate")
    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    @C11314h(name = "noCache")
    public final boolean noCache() {
        return this.noCache;
    }

    @C11314h(name = "noStore")
    public final boolean noStore() {
        return this.noStore;
    }

    @C11314h(name = "noTransform")
    public final boolean noTransform() {
        return this.noTransform;
    }

    @C11314h(name = "onlyIfCached")
    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    @C11314h(name = "sMaxAgeSeconds")
    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @C12579k
    public String toString() {
        boolean z;
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.noCache) {
            sb.append("no-cache, ");
        }
        if (this.noStore) {
            sb.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb.append("max-age=");
            sb.append(this.maxAgeSeconds);
            sb.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb.append("s-maxage=");
            sb.append(this.sMaxAgeSeconds);
            sb.append(", ");
        }
        if (this.isPrivate) {
            sb.append("private, ");
        }
        if (this.isPublic) {
            sb.append("public, ");
        }
        if (this.mustRevalidate) {
            sb.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb.append("max-stale=");
            sb.append(this.maxStaleSeconds);
            sb.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb.append("min-fresh=");
            sb.append(this.minFreshSeconds);
            sb.append(", ");
        }
        if (this.onlyIfCached) {
            sb.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb.append("no-transform, ");
        }
        if (this.immutable) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = sb2;
        return sb2;
    }

    public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }
}
