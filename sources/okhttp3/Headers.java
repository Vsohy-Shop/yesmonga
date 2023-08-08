package okhttp3;

import com.urbanairship.wallet.C9700d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.Pair;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11333h;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import kotlin.ranges.C11463j;
import kotlin.ranges.C11479u;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.C12361b;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import p073j$.time.Instant;
import p073j$.util.DateRetargetClass;

@C11076d0(mo22515d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000 '2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002('B\u0017\b\u0002\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\"¢\u0006\u0004\b%\u0010&J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0014J\u001b\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0016H\u0002J\u0006\u0010\u0019\u001a\u00020\u0018J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\r\u0010\f¨\u0006)"}, mo22516d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "name", "get", "Ljava/util/Date;", "getDate", "j$/time/Instant", "getInstant", "", "-deprecated_size", "()I", "size", "index", "value", "", "names", "", "values", "", "byteCount", "", "iterator", "Lokhttp3/Headers$Builder;", "newBuilder", "", "other", "", "equals", "hashCode", "toString", "", "toMultimap", "", "namesAndValues", "[Ljava/lang/String;", "<init>", "([Ljava/lang/String;)V", "Companion", "Builder", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, C11345a {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String[] namesAndValues;

    @C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000eJ\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000fH\u0007J\u0019\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000eH\u0002J\u0019\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000fH\u0002J\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002J\u0019\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0006\u0010\u0014\u001a\u00020\u000bR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0000X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, mo22516d2 = {"Lokhttp3/Headers$Builder;", "", "", "line", "addLenient$okhttp", "(Ljava/lang/String;)Lokhttp3/Headers$Builder;", "addLenient", "add", "name", "value", "addUnsafeNonAscii", "Lokhttp3/Headers;", "headers", "addAll", "Ljava/util/Date;", "j$/time/Instant", "set", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "removeAll", "get", "build", "", "namesAndValues", "Ljava/util/List;", "getNamesAndValues$okhttp", "()Ljava/util/List;", "<init>", "()V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static final class Builder {
        @C12579k
        private final List<String> namesAndValues = new ArrayList(20);

        @C12579k
        public final Builder add(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "line");
            int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, (char) C12361b.f30257h, 0, false, 6, (Object) null);
            if (indexOf$default != -1) {
                String substring = str.substring(0, indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (substring != null) {
                    String obj = StringsKt__StringsKt.trim(substring).toString();
                    String substring2 = str.substring(indexOf$default + 1);
                    Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
                    add(obj, substring2);
                    return this;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }

        @C12579k
        public final Builder addAll(@C12579k Headers headers) {
            Intrinsics.checkNotNullParameter(headers, C9700d.f26570q);
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                addLenient$okhttp(headers.name(i), headers.value(i));
            }
            return this;
        }

        @C12579k
        public final Builder addLenient$okhttp(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "line");
            int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, (char) C12361b.f30257h, 1, false, 4, (Object) null);
            if (indexOf$default != -1) {
                String substring = str.substring(0, indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = str.substring(indexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring3, "(this as java.lang.String).substring(startIndex)");
                addLenient$okhttp("", substring3);
            } else {
                addLenient$okhttp("", str);
            }
            return this;
        }

        @C12579k
        public final Builder addUnsafeNonAscii(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "value");
            Headers.Companion.checkName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        @C12579k
        public final Headers build() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            if (array != null) {
                return new Headers((String[]) array, (DefaultConstructorMarker) null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        @C12580l
        public final String get(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            C11463j B1 = C11479u.m44315B1(C11479u.m44418k0(this.namesAndValues.size() - 2, 0), 2);
            int r = B1.mo23049r();
            int w = B1.mo23051w();
            int y = B1.mo23052y();
            if (y >= 0) {
                if (r > w) {
                    return null;
                }
            } else if (r < w) {
                return null;
            }
            while (!C11622t.equals(str, this.namesAndValues.get(r), true)) {
                if (r == w) {
                    return null;
                }
                r += y;
            }
            return this.namesAndValues.get(r + 1);
        }

        @C12579k
        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        @C12579k
        public final Builder removeAll(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            int i = 0;
            while (i < this.namesAndValues.size()) {
                if (C11622t.equals(str, this.namesAndValues.get(i), true)) {
                    this.namesAndValues.remove(i);
                    this.namesAndValues.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        @C12579k
        public final Builder set(@C12579k String str, @C12579k Date date) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(date, "value");
            set(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        @C12579k
        public final Builder set(@C12579k String str, @C12579k Instant instant) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(instant, "value");
            return set(str, new Date(instant.toEpochMilli()));
        }

        @C12579k
        public final Builder set(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            removeAll(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        @C12579k
        public final Builder add(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        @C12579k
        public final Builder addLenient$okhttp(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "value");
            this.namesAndValues.add(str);
            this.namesAndValues.add(StringsKt__StringsKt.trim(str2).toString());
            return this;
        }

        @C12579k
        public final Builder add(@C12579k String str, @C12579k Date date) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(date, "value");
            add(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        @C12579k
        public final Builder add(@C12579k String str, @C12579k Instant instant) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(instant, "value");
            add(str, new Date(instant.toEpochMilli()));
            return this;
        }
    }

    @C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J#\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011H\u0007¢\u0006\u0004\b\r\u0010\u0012J#\u0010\r\u001a\u00020\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011H\u0007¢\u0006\u0004\b\u0010\u0010\u0012¨\u0006\u0017"}, mo22516d2 = {"Lokhttp3/Headers$Companion;", "", "", "", "namesAndValues", "name", "get", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/d2;", "checkName", "value", "checkValue", "Lokhttp3/Headers;", "of", "([Ljava/lang/String;)Lokhttp3/Headers;", "headersOf", "-deprecated_of", "", "(Ljava/util/Map;)Lokhttp3/Headers;", "toHeaders", "headers", "<init>", "()V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final void checkName(String str) {
            boolean z;
            boolean z2;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if ('!' <= charAt && '~' >= charAt) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i++;
                    } else {
                        throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            boolean z;
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt == 9 || (' ' <= charAt && '~' >= charAt)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i++;
                } else {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str).toString());
                }
            }
        }

        /* access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            C11463j B1 = C11479u.m44315B1(C11479u.m44418k0(strArr.length - 2, 0), 2);
            int r = B1.mo23049r();
            int w = B1.mo23051w();
            int y = B1.mo23052y();
            if (y >= 0) {
                if (r > w) {
                    return null;
                }
            } else if (r < w) {
                return null;
            }
            while (!C11622t.equals(str, strArr[r], true)) {
                if (r == w) {
                    return null;
                }
                r += y;
            }
            return strArr[r + 1];
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "function name changed", replaceWith = @C11587t0(expression = "headersOf(*namesAndValues)", imports = {}))
        @C11314h(name = "-deprecated_of")
        @C12579k
        /* renamed from: -deprecated_of  reason: not valid java name */
        public final Headers m172639deprecated_of(@C12579k String... strArr) {
            Intrinsics.checkNotNullParameter(strArr, "namesAndValues");
            return mo25940of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @C11314h(name = "of")
        @C12579k
        @C11384m
        /* renamed from: of */
        public final Headers mo25940of(@C12579k String... strArr) {
            Intrinsics.checkNotNullParameter(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                if (clone != null) {
                    String[] strArr2 = (String[]) clone;
                    int length = strArr2.length;
                    int i = 0;
                    while (i < length) {
                        String str = strArr2[i];
                        if (!(str != null)) {
                            throw new IllegalArgumentException("Headers cannot be null".toString());
                        } else if (str != null) {
                            strArr2[i] = StringsKt__StringsKt.trim(str).toString();
                            i++;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    }
                    C11463j B1 = C11479u.m44315B1(C11479u.m44378W1(0, strArr2.length), 2);
                    int r = B1.mo23049r();
                    int w = B1.mo23051w();
                    int y = B1.mo23052y();
                    if (y < 0 ? r >= w : r <= w) {
                        while (true) {
                            String str2 = strArr2[r];
                            String str3 = strArr2[r + 1];
                            checkName(str2);
                            checkValue(str3, str2);
                            if (r == w) {
                                break;
                            }
                            r += y;
                        }
                    }
                    return new Headers(strArr2, (DefaultConstructorMarker) null);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "function moved to extension", replaceWith = @C11587t0(expression = "headers.toHeaders()", imports = {}))
        @C11314h(name = "-deprecated_of")
        @C12579k
        /* renamed from: -deprecated_of  reason: not valid java name */
        public final Headers m172638deprecated_of(@C12579k Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, C9700d.f26570q);
            return mo25939of(map);
        }

        @C11314h(name = "of")
        @C12579k
        @C11384m
        /* renamed from: of */
        public final Headers mo25939of(@C12579k Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "$this$toHeaders");
            String[] strArr = new String[(map.size() * 2)];
            int i = 0;
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                String str2 = (String) next.getValue();
                if (str != null) {
                    String obj = StringsKt__StringsKt.trim(str).toString();
                    if (str2 != null) {
                        String obj2 = StringsKt__StringsKt.trim(str2).toString();
                        checkName(obj);
                        checkValue(obj2, obj);
                        strArr[i] = obj;
                        strArr[i + 1] = obj2;
                        i += 2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            return new Headers(strArr, (DefaultConstructorMarker) null);
        }
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    @C11314h(name = "of")
    @C12579k
    @C11384m
    /* renamed from: of */
    public static final Headers m50346of(@C12579k Map<String, String> map) {
        return Companion.mo25939of(map);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "size", imports = {}))
    @C11314h(name = "-deprecated_size")
    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m172637deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = (long) (strArr.length * 2);
        int length2 = strArr.length;
        for (int i = 0; i < length2; i++) {
            length += (long) this.namesAndValues[i].length();
        }
        return length;
    }

    public boolean equals(@C12580l Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    @C12580l
    public final String get(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return Companion.get(this.namesAndValues, str);
    }

    @C12580l
    public final Date getDate(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        String str2 = get(str);
        if (str2 != null) {
            return DatesKt.toHttpDateOrNull(str2);
        }
        return null;
    }

    @C12580l
    @IgnoreJRERequirement
    public final Instant getInstant(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        Date date = getDate(str);
        if (date != null) {
            return DateRetargetClass.toInstant(date);
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @C12579k
    public Iterator<Pair<String, String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = C11078d1.m42659a(name(i), value(i));
        }
        return C11333h.m43500a(pairArr);
    }

    @C12579k
    public final String name(int i) {
        return this.namesAndValues[i * 2];
    }

    @C12579k
    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(C11622t.getCASE_INSENSITIVE_ORDER(C11368t0.f28504a));
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @C12579k
    public final Builder newBuilder() {
        Builder builder = new Builder();
        C10994x.m42362p0(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    @C11314h(name = "size")
    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @C12579k
    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(C11622t.getCASE_INSENSITIVE_ORDER(C11368t0.f28504a));
        int size = size();
        int i = 0;
        while (i < size) {
            String name = name(i);
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            if (name != null) {
                String lowerCase = name.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                List list = (List) treeMap.get(lowerCase);
                if (list == null) {
                    list = new ArrayList(2);
                    treeMap.put(lowerCase, list);
                }
                list.add(value(i));
                i++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return treeMap;
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            sb.append(name(i));
            sb.append(": ");
            sb.append(value(i));
            sb.append("\n");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @C12579k
    public final String value(int i) {
        return this.namesAndValues[(i * 2) + 1];
    }

    @C12579k
    public final List<String> values(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (C11622t.equals(str, name(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i));
            }
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    public /* synthetic */ Headers(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    @C11314h(name = "of")
    @C12579k
    @C11384m
    /* renamed from: of */
    public static final Headers m50347of(@C12579k String... strArr) {
        return Companion.mo25940of(strArr);
    }
}
