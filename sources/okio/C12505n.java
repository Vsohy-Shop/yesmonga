package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.n */
public interface C12505n extends C12506n0, WritableByteChannel {
    @C12579k
    /* renamed from: B0 */
    C12505n mo27220B0(long j) throws IOException;

    @C12579k
    /* renamed from: B2 */
    C12505n mo27221B2(@C12579k ByteString byteString, int i, int i2) throws IOException;

    @C12579k
    /* renamed from: G3 */
    C12505n mo27222G3(@C12579k ByteString byteString) throws IOException;

    @C11395k(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @C11587t0(expression = "buffer", imports = {}))
    @C12579k
    /* renamed from: H */
    C12500m mo27223H();

    @C12579k
    /* renamed from: H2 */
    C12505n mo27224H2(int i) throws IOException;

    @C12579k
    /* renamed from: K2 */
    C12505n mo27225K2(int i) throws IOException;

    @C12579k
    /* renamed from: Q1 */
    C12505n mo27226Q1(@C12579k byte[] bArr) throws IOException;

    @C12579k
    /* renamed from: T3 */
    C12505n mo27227T3(long j) throws IOException;

    @C12579k
    /* renamed from: W3 */
    OutputStream mo27228W3();

    @C12579k
    /* renamed from: Y0 */
    C12505n mo27229Y0() throws IOException;

    @C12579k
    /* renamed from: Y2 */
    C12505n mo27230Y2(int i) throws IOException;

    @C12579k
    /* renamed from: b2 */
    C12505n mo27231b2(@C12579k String str, int i, int i2, @C12579k Charset charset) throws IOException;

    @C12579k
    /* renamed from: e */
    C12500m mo27232e();

    void flush() throws IOException;

    @C12579k
    /* renamed from: g2 */
    C12505n mo27233g2(long j) throws IOException;

    @C12579k
    /* renamed from: k3 */
    C12505n mo27235k3(@C12579k byte[] bArr, int i, int i2) throws IOException;

    @C12579k
    /* renamed from: l1 */
    C12505n mo27236l1(@C12579k String str) throws IOException;

    @C12579k
    /* renamed from: m3 */
    C12505n mo27237m3(long j) throws IOException;

    @C12579k
    /* renamed from: o3 */
    C12505n mo27238o3(@C12579k String str, @C12579k Charset charset) throws IOException;

    @C12579k
    /* renamed from: s3 */
    C12505n mo27239s3(@C12579k C12510p0 p0Var, long j) throws IOException;

    @C12579k
    /* renamed from: u0 */
    C12505n mo27241u0() throws IOException;

    @C12579k
    /* renamed from: v1 */
    C12505n mo27242v1(@C12579k String str, int i, int i2) throws IOException;

    @C12579k
    /* renamed from: w0 */
    C12505n mo27243w0(int i) throws IOException;

    /* renamed from: x1 */
    long mo27245x1(@C12579k C12510p0 p0Var) throws IOException;

    @C12579k
    /* renamed from: z0 */
    C12505n mo27246z0(int i) throws IOException;

    @C12579k
    /* renamed from: z2 */
    C12505n mo27247z2(int i) throws IOException;
}
