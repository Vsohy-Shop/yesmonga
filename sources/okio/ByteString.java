package okio;

import androidx.constraintlayout.core.motion.utils.C16717v;
import com.google.android.datatransport.cct.C40042a;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.collections.C10956m;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11315i;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11602d;
import kotlin.text.C11622t;
import kotlinx.serialization.json.internal.C12361b;
import okio.internal.C12482b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.DateTimeFieldType;

@C11076d0(mo22515d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0016\u0018\u0000 c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001RB\u0011\b\u0000\u0012\u0006\u0010]\u001a\u00020-¢\u0006\u0004\ba\u0010bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0006\u0010\u0010\u001a\u00020\u0000J\u0006\u0010\u0011\u001a\u00020\u0000J\u0006\u0010\u0012\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\u0000J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0016J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0016J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0016J\u001f\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\nH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\u0000H\u0016J\b\u0010 \u001a\u00020\u0000H\u0016J\u001c\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!H\u0017J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020!H\u0010¢\u0006\u0004\b'\u0010(J\u0018\u0010*\u001a\u00020&2\u0006\u0010)\u001a\u00020!H\u0002¢\u0006\u0004\b*\u0010(J\u000f\u0010+\u001a\u00020!H\u0010¢\u0006\u0004\b+\u0010,J\b\u0010.\u001a\u00020-H\u0016J\u000f\u0010/\u001a\u00020-H\u0010¢\u0006\u0004\b/\u00100J\b\u00102\u001a\u000201H\u0016J\u0010\u00104\u001a\u00020\u00052\u0006\u0010\b\u001a\u000203H\u0016J'\u00109\u001a\u00020\u00052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0010¢\u0006\u0004\b9\u0010:J(\u0010>\u001a\u00020=2\u0006\u00107\u001a\u00020!2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0016J(\u0010?\u001a\u00020=2\u0006\u00107\u001a\u00020!2\u0006\u0010;\u001a\u00020-2\u0006\u0010<\u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0016J\u000e\u0010A\u001a\u00020=2\u0006\u0010@\u001a\u00020\u0000J\u000e\u0010B\u001a\u00020=2\u0006\u0010@\u001a\u00020-J\u000e\u0010D\u001a\u00020=2\u0006\u0010C\u001a\u00020\u0000J\u000e\u0010E\u001a\u00020=2\u0006\u0010C\u001a\u00020-J\u001a\u0010G\u001a\u00020!2\u0006\u0010;\u001a\u00020\u00002\b\b\u0002\u0010F\u001a\u00020!H\u0007J\u001a\u0010H\u001a\u00020!2\u0006\u0010;\u001a\u00020-2\b\b\u0002\u0010F\u001a\u00020!H\u0017J\u001a\u0010I\u001a\u00020!2\u0006\u0010;\u001a\u00020\u00002\b\b\u0002\u0010F\u001a\u00020!H\u0007J\u001a\u0010J\u001a\u00020!2\u0006\u0010;\u001a\u00020-2\b\b\u0002\u0010F\u001a\u00020!H\u0017J\u0013\u0010L\u001a\u00020=2\b\u0010;\u001a\u0004\u0018\u00010KH\u0002J\b\u0010M\u001a\u00020!H\u0016J\u0011\u0010N\u001a\u00020!2\u0006\u0010;\u001a\u00020\u0000H\u0002J\b\u0010O\u001a\u00020\nH\u0016J\u0017\u0010P\u001a\u00020&2\u0006\u0010)\u001a\u00020!H\u0007¢\u0006\u0004\bP\u0010(J\u000f\u0010Q\u001a\u00020!H\u0007¢\u0006\u0004\bQ\u0010,R\"\u0010M\u001a\u00020!8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010,\"\u0004\bU\u0010VR$\u0010\\\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bP\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001a\u0010]\u001a\u00020-8\u0000X\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u00100R\u0011\u0010`\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b`\u0010,¨\u0006d"}, mo22516d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", "in", "Lkotlin/d2;", "readObject", "Ljava/io/ObjectOutputStream;", "out", "writeObject", "", "s2", "Ljava/nio/charset/Charset;", "charset", "k2", "r", "A1", "Y1", "c2", "e2", "algorithm", "Q", "(Ljava/lang/String;)Lokio/ByteString;", "key", "A0", "C0", "F0", "u0", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "w", "t0", "p2", "q2", "", "beginIndex", "endIndex", "n2", "pos", "", "c1", "(I)B", "index", "f0", "o0", "()I", "", "r2", "U0", "()[B", "Ljava/nio/ByteBuffer;", "q", "Ljava/io/OutputStream;", "t2", "Lokio/m;", "buffer", "offset", "byteCount", "u2", "(Lokio/m;II)V", "other", "otherOffset", "", "H1", "L1", "prefix", "i2", "j2", "suffix", "Z", "e0", "fromIndex", "K0", "N0", "k1", "q1", "", "equals", "hashCode", "y", "toString", "b", "g", "a", "I", "n0", "T1", "(I)V", "Ljava/lang/String;", "p0", "()Ljava/lang/String;", "X1", "(Ljava/lang/String;)V", "utf8", "data", "[B", "m0", "size", "<init>", "([B)V", "d", "okio"}, mo22517k = 1, mo22518mv = {1, 4, 1})
public class ByteString implements Serializable, Comparable<ByteString> {
    @C12579k
    @C11287e

    /* renamed from: c */
    public static final ByteString f30387c = new ByteString(new byte[0]);
    @C12579k

    /* renamed from: d */
    public static final C12459a f30388d = new C12459a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public transient int f30389a;
    @C12580l

    /* renamed from: b */
    public transient String f30390b;
    @C12579k
    private final byte[] data;

    /* renamed from: okio.ByteString$a */
    public static final class C12459a {
        public C12459a() {
        }

        /* renamed from: k */
        public static /* synthetic */ ByteString m50416k(C12459a aVar, String str, Charset charset, int i, Object obj) {
            if ((i & 1) != 0) {
                charset = C11602d.f28868b;
            }
            return aVar.mo27166j(str, charset);
        }

        /* renamed from: p */
        public static /* synthetic */ ByteString m50417p(C12459a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo27170o(bArr, i, i2);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @C12580l
        @C11314h(name = "-deprecated_decodeBase64")
        /* renamed from: a */
        public final ByteString mo27157a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
            return mo27164h(str);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        @C11314h(name = "-deprecated_decodeHex")
        @C12579k
        /* renamed from: b */
        public final ByteString mo27158b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
            return mo27165i(str);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        @C11314h(name = "-deprecated_encodeString")
        @C12579k
        /* renamed from: c */
        public final ByteString mo27159c(@C12579k String str, @C12579k Charset charset) {
            Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
            Intrinsics.checkNotNullParameter(charset, "charset");
            return mo27166j(str, charset);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        @C11314h(name = "-deprecated_encodeUtf8")
        @C12579k
        /* renamed from: d */
        public final ByteString mo27160d(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
            return mo27167l(str);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        @C11314h(name = "-deprecated_of")
        @C12579k
        /* renamed from: e */
        public final ByteString mo27161e(@C12579k ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "buffer");
            return mo27168m(byteBuffer);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        @C11314h(name = "-deprecated_of")
        @C12579k
        /* renamed from: f */
        public final ByteString mo27162f(@C12579k byte[] bArr, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "array");
            return mo27170o(bArr, i, i2);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        @C11314h(name = "-deprecated_read")
        @C12579k
        /* renamed from: g */
        public final ByteString mo27163g(@C12579k InputStream inputStream, int i) {
            Intrinsics.checkNotNullParameter(inputStream, "inputstream");
            return mo27171q(inputStream, i);
        }

        @C12580l
        @C11384m
        /* renamed from: h */
        public final ByteString mo27164h(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "$this$decodeBase64");
            byte[] a = C12460a.m50456a(str);
            if (a != null) {
                return new ByteString(a);
            }
            return null;
        }

        @C12579k
        @C11384m
        /* renamed from: i */
        public final ByteString mo27165i(@C12579k String str) {
            boolean z;
            Intrinsics.checkNotNullParameter(str, "$this$decodeHex");
            if (str.length() % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) ((C12482b.m50638H(str.charAt(i2)) << 4) + C12482b.m50638H(str.charAt(i2 + 1)));
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        @C11314h(name = "encodeString")
        @C12579k
        @C11384m
        /* renamed from: j */
        public final ByteString mo27166j(@C12579k String str, @C12579k Charset charset) {
            Intrinsics.checkNotNullParameter(str, "$this$encode");
            Intrinsics.checkNotNullParameter(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        @C12579k
        @C11384m
        /* renamed from: l */
        public final ByteString mo27167l(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "$this$encodeUtf8");
            ByteString byteString = new ByteString(C12477i.m50546a(str));
            byteString.mo27116X1(str);
            return byteString;
        }

        @C11314h(name = "of")
        @C12579k
        @C11384m
        /* renamed from: m */
        public final ByteString mo27168m(@C12579k ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "$this$toByteString");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }

        @C12579k
        @C11384m
        /* renamed from: n */
        public final ByteString mo27169n(@C12579k byte... bArr) {
            Intrinsics.checkNotNullParameter(bArr, "data");
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new ByteString(copyOf);
        }

        @C11314h(name = "of")
        @C12579k
        @C11384m
        /* renamed from: o */
        public final ByteString mo27170o(@C12579k byte[] bArr, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "$this$toByteString");
            C12487j.m50748e((long) bArr.length, (long) i, (long) i2);
            return new ByteString(C10956m.m41052G1(bArr, i, i2 + i));
        }

        @C11314h(name = "read")
        @C12579k
        @C11384m
        /* renamed from: q */
        public final ByteString mo27171q(@C12579k InputStream inputStream, int i) throws IOException {
            boolean z;
            Intrinsics.checkNotNullParameter(inputStream, "$this$readByteString");
            int i2 = 0;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = new byte[i];
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(("byteCount < 0: " + i).toString());
        }

        public /* synthetic */ C12459a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ByteString(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "data");
        this.data = bArr;
    }

    @C11314h(name = "of")
    @C12579k
    @C11384m
    /* renamed from: B1 */
    public static final ByteString m50354B1(@C12579k ByteBuffer byteBuffer) {
        return f30388d.mo27168m(byteBuffer);
    }

    @C12579k
    @C11384m
    /* renamed from: F1 */
    public static final ByteString m50355F1(@C12579k byte... bArr) {
        return f30388d.mo27169n(bArr);
    }

    @C11314h(name = "of")
    @C12579k
    @C11384m
    /* renamed from: G1 */
    public static final ByteString m50356G1(@C12579k byte[] bArr, int i, int i2) {
        return f30388d.mo27170o(bArr, i, i2);
    }

    @C12579k
    @C11384m
    /* renamed from: M */
    public static final ByteString m50357M(@C12579k String str) {
        return f30388d.mo27165i(str);
    }

    @C11314h(name = "read")
    @C12579k
    @C11384m
    /* renamed from: M1 */
    public static final ByteString m50358M1(@C12579k InputStream inputStream, int i) throws IOException {
        return f30388d.mo27171q(inputStream, i);
    }

    /* renamed from: O0 */
    public static /* synthetic */ int m50359O0(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return byteString.mo27109K0(byteString2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    /* renamed from: R0 */
    public static /* synthetic */ int m50360R0(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return byteString.mo27112N0(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    @C11314h(name = "encodeString")
    @C12579k
    @C11384m
    /* renamed from: W */
    public static final ByteString m50361W(@C12579k String str, @C12579k Charset charset) {
        return f30388d.mo27166j(str, charset);
    }

    @C12579k
    @C11384m
    /* renamed from: X */
    public static final ByteString m50362X(@C12579k String str) {
        return f30388d.mo27167l(str);
    }

    /* renamed from: o2 */
    public static /* synthetic */ ByteString m50363o2(ByteString byteString, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = byteString.size();
            }
            return byteString.mo27139n2(i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        ByteString q = f30388d.mo27171q(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField("data");
        Intrinsics.checkNotNullExpressionValue(declaredField, "field");
        declaredField.setAccessible(true);
        declaredField.set(this, q.data);
    }

    /* renamed from: w1 */
    public static /* synthetic */ int m50364w1(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = byteString.size();
            }
            return byteString.mo27132k1(byteString2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    @C12580l
    @C11384m
    /* renamed from: z */
    public static final ByteString m50365z(@C12579k String str) {
        return f30388d.mo27164h(str);
    }

    /* renamed from: z1 */
    public static /* synthetic */ int m50366z1(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = byteString.size();
            }
            return byteString.mo27144q1(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    @C12579k
    /* renamed from: A0 */
    public ByteString mo27103A0(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "key");
        return mo27153u0("HmacSHA1", byteString);
    }

    @C12579k
    /* renamed from: A1 */
    public final ByteString mo27104A1() {
        return mo27113Q("MD5");
    }

    @C12579k
    /* renamed from: C0 */
    public ByteString mo27105C0(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "key");
        return mo27153u0("HmacSHA256", byteString);
    }

    @C12579k
    /* renamed from: F0 */
    public ByteString mo27106F0(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "key");
        return mo27153u0("HmacSHA512", byteString);
    }

    @C11315i
    /* renamed from: H0 */
    public final int mo27107H0(@C12579k ByteString byteString) {
        return m50359O0(this, byteString, 0, 2, (Object) null);
    }

    /* renamed from: H1 */
    public boolean mo27108H1(int i, @C12579k ByteString byteString, int i2, int i3) {
        Intrinsics.checkNotNullParameter(byteString, "other");
        return byteString.mo27111L1(i2, mo27135m0(), i, i3);
    }

    @C11315i
    /* renamed from: K0 */
    public final int mo27109K0(@C12579k ByteString byteString, int i) {
        Intrinsics.checkNotNullParameter(byteString, "other");
        return mo27112N0(byteString.mo27115U0(), i);
    }

    @C11315i
    /* renamed from: L0 */
    public final int mo27110L0(@C12579k byte[] bArr) {
        return m50360R0(this, bArr, 0, 2, (Object) null);
    }

    /* renamed from: L1 */
    public boolean mo27111L1(int i, @C12579k byte[] bArr, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "other");
        if (i < 0 || i > mo27135m0().length - i3 || i2 < 0 || i2 > bArr.length - i3 || !C12487j.m50747d(mo27135m0(), i, bArr, i2, i3)) {
            return false;
        }
        return true;
    }

    @C11315i
    /* renamed from: N0 */
    public int mo27112N0(@C12579k byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "other");
        int length = mo27135m0().length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!C12487j.m50747d(mo27135m0(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    @C12579k
    /* renamed from: Q */
    public ByteString mo27113Q(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(this.data, 0, size());
        byte[] digest = instance.digest();
        Intrinsics.checkNotNullExpressionValue(digest, "digestBytes");
        return new ByteString(digest);
    }

    /* renamed from: T1 */
    public final void mo27114T1(int i) {
        this.f30389a = i;
    }

    @C12579k
    /* renamed from: U0 */
    public byte[] mo27115U0() {
        return mo27135m0();
    }

    /* renamed from: X1 */
    public final void mo27116X1(@C12580l String str) {
        this.f30390b = str;
    }

    @C12579k
    /* renamed from: Y1 */
    public final ByteString mo27117Y1() {
        return mo27113Q(CommonUtils.f79238a);
    }

    /* renamed from: Z */
    public final boolean mo27118Z(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "suffix");
        return mo27108H1(size() - byteString.size(), byteString, 0, byteString.size());
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @C11587t0(expression = "this[index]", imports = {}))
    @C11314h(name = "-deprecated_getByte")
    /* renamed from: b */
    public final byte mo27119b(int i) {
        return mo27126f0(i);
    }

    /* renamed from: c1 */
    public byte mo27120c1(int i) {
        return mo27135m0()[i];
    }

    @C12579k
    /* renamed from: c2 */
    public final ByteString mo27121c2() {
        return mo27113Q("SHA-256");
    }

    /* renamed from: e0 */
    public final boolean mo27123e0(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "suffix");
        return mo27111L1(size() - bArr.length, bArr, 0, bArr.length);
    }

    @C12579k
    /* renamed from: e2 */
    public final ByteString mo27124e2() {
        return mo27113Q("SHA-512");
    }

    public boolean equals(@C12580l Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == mo27135m0().length && byteString.mo27111L1(0, mo27135m0(), 0, mo27135m0().length)) {
                return true;
            }
        }
        return false;
    }

    @C11314h(name = "getByte")
    /* renamed from: f0 */
    public final byte mo27126f0(int i) {
        return mo27120c1(i);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "size", imports = {}))
    @C11314h(name = "-deprecated_size")
    /* renamed from: g */
    public final int mo27127g() {
        return size();
    }

    public int hashCode() {
        int n0 = mo27137n0();
        if (n0 != 0) {
            return n0;
        }
        int hashCode = Arrays.hashCode(mo27135m0());
        mo27114T1(hashCode);
        return hashCode;
    }

    /* renamed from: i2 */
    public final boolean mo27129i2(@C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "prefix");
        return mo27108H1(0, byteString, 0, byteString.size());
    }

    @C11315i
    /* renamed from: j1 */
    public final int mo27130j1(@C12579k ByteString byteString) {
        return m50364w1(this, byteString, 0, 2, (Object) null);
    }

    /* renamed from: j2 */
    public final boolean mo27131j2(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "prefix");
        return mo27111L1(0, bArr, 0, bArr.length);
    }

    @C11315i
    /* renamed from: k1 */
    public final int mo27132k1(@C12579k ByteString byteString, int i) {
        Intrinsics.checkNotNullParameter(byteString, "other");
        return mo27144q1(byteString.mo27115U0(), i);
    }

    @C12579k
    /* renamed from: k2 */
    public String mo27133k2(@C12579k Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(this.data, charset);
    }

    @C12579k
    @C11315i
    /* renamed from: l2 */
    public final ByteString mo27134l2() {
        return m50363o2(this, 0, 0, 3, (Object) null);
    }

    @C12579k
    /* renamed from: m0 */
    public final byte[] mo27135m0() {
        return this.data;
    }

    @C12579k
    @C11315i
    /* renamed from: m2 */
    public final ByteString mo27136m2(int i) {
        return m50363o2(this, i, 0, 2, (Object) null);
    }

    /* renamed from: n0 */
    public final int mo27137n0() {
        return this.f30389a;
    }

    @C11315i
    /* renamed from: n1 */
    public final int mo27138n1(@C12579k byte[] bArr) {
        return m50366z1(this, bArr, 0, 2, (Object) null);
    }

    @C12579k
    @C11315i
    /* renamed from: n2 */
    public ByteString mo27139n2(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 <= mo27135m0().length) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 - i < 0) {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                } else if (i == 0 && i2 == mo27135m0().length) {
                    return this;
                } else {
                    return new ByteString(C10956m.m41052G1(mo27135m0(), i, i2));
                }
            } else {
                throw new IllegalArgumentException(("endIndex > length(" + mo27135m0().length + ')').toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
    }

    /* renamed from: o0 */
    public int mo27140o0() {
        return mo27135m0().length;
    }

    @C12580l
    /* renamed from: p0 */
    public final String mo27141p0() {
        return this.f30390b;
    }

    @C12579k
    /* renamed from: p2 */
    public ByteString mo27142p2() {
        byte b;
        int i = 0;
        while (i < mo27135m0().length) {
            byte b2 = mo27135m0()[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] m0 = mo27135m0();
                byte[] copyOf = Arrays.copyOf(m0, m0.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    @C12579k
    /* renamed from: q */
    public ByteBuffer mo27143q() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        Intrinsics.checkNotNullExpressionValue(asReadOnlyBuffer, "ByteBuffer.wrap(data).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    @C11315i
    /* renamed from: q1 */
    public int mo27144q1(@C12579k byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "other");
        for (int min = Math.min(i, mo27135m0().length - bArr.length); min >= 0; min--) {
            if (C12487j.m50747d(mo27135m0(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    @C12579k
    /* renamed from: q2 */
    public ByteString mo27145q2() {
        byte b;
        int i = 0;
        while (i < mo27135m0().length) {
            byte b2 = mo27135m0()[i];
            byte b3 = (byte) 97;
            if (b2 < b3 || b2 > (b = (byte) 122)) {
                i++;
            } else {
                byte[] m0 = mo27135m0();
                byte[] copyOf = Arrays.copyOf(m0, m0.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    @C12579k
    /* renamed from: r */
    public String mo27146r() {
        return C12460a.m50458c(mo27135m0(), (byte[]) null, 1, (Object) null);
    }

    @C12579k
    /* renamed from: r2 */
    public byte[] mo27147r2() {
        byte[] m0 = mo27135m0();
        byte[] copyOf = Arrays.copyOf(m0, m0.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @C12579k
    /* renamed from: s2 */
    public String mo27148s2() {
        String p0 = mo27141p0();
        if (p0 != null) {
            return p0;
        }
        String c = C12477i.m50548c(mo27115U0());
        mo27116X1(c);
        return c;
    }

    @C11314h(name = "size")
    public final int size() {
        return mo27140o0();
    }

    @C12579k
    /* renamed from: t0 */
    public String mo27150t0() {
        char[] cArr = new char[(mo27135m0().length * 2)];
        int i = 0;
        for (byte b : mo27135m0()) {
            int i2 = i + 1;
            cArr[i] = C12482b.m50639I()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = C12482b.m50639I()[b & DateTimeFieldType.f30626Z];
        }
        return new String(cArr);
    }

    /* renamed from: t2 */
    public void mo27151t2(@C12579k OutputStream outputStream) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "out");
        outputStream.write(this.data);
    }

    @C12579k
    public String toString() {
        boolean z;
        ByteString byteString;
        boolean z2 = true;
        if (mo27135m0().length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "[size=0]";
        }
        int a = C12482b.m50642c(mo27135m0(), 64);
        if (a != -1) {
            String s2 = mo27148s2();
            if (s2 != null) {
                String substring = s2.substring(0, a);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String replace$default = C11622t.replace$default(C11622t.replace$default(C11622t.replace$default(substring, C40042a.f102078h, "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                if (a < s2.length()) {
                    return "[size=" + mo27135m0().length + " text=" + replace$default + "…]";
                }
                return "[text=" + replace$default + C12361b.f30261l;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } else if (mo27135m0().length <= 64) {
            return "[hex=" + mo27150t0() + C12361b.f30261l;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[size=");
            sb.append(mo27135m0().length);
            sb.append(" hex=");
            if (64 > mo27135m0().length) {
                z2 = false;
            }
            if (z2) {
                if (64 == mo27135m0().length) {
                    byteString = this;
                } else {
                    byteString = new ByteString(C10956m.m41052G1(mo27135m0(), 0, 64));
                }
                sb.append(byteString.mo27150t0());
                sb.append("…]");
                return sb.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + mo27135m0().length + ')').toString());
        }
    }

    @C12579k
    /* renamed from: u0 */
    public ByteString mo27153u0(@C12579k String str, @C12579k ByteString byteString) {
        Intrinsics.checkNotNullParameter(str, "algorithm");
        Intrinsics.checkNotNullParameter(byteString, "key");
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(byteString.mo27147r2(), str));
            byte[] doFinal = instance.doFinal(this.data);
            Intrinsics.checkNotNullExpressionValue(doFinal, "mac.doFinal(data)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: u2 */
    public void mo27154u2(@C12579k C12500m mVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(mVar, "buffer");
        C12482b.m50637G(this, mVar, i, i2);
    }

    @C12579k
    /* renamed from: w */
    public String mo27155w() {
        return C12460a.m50457b(mo27135m0(), C12460a.m50460e());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r7 < r8) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r0 < r1) goto L_0x0030;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(@org.jetbrains.annotations.C12579k okio.ByteString r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.mo27126f0(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.mo27126f0(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x0032
            goto L_0x0030
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            if (r0 >= r1) goto L_0x0032
        L_0x0030:
            r3 = r5
            goto L_0x0033
        L_0x0032:
            r3 = r6
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }
}
