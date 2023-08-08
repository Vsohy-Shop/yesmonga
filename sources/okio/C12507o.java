package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: okio.o */
public interface C12507o extends C12510p0, ReadableByteChannel {
    @C12579k
    /* renamed from: B3 */
    String mo27268B3() throws IOException;

    /* renamed from: E1 */
    boolean mo27269E1(long j) throws IOException;

    @C12579k
    /* renamed from: E3 */
    String mo27270E3(long j, @C12579k Charset charset) throws IOException;

    @C12579k
    /* renamed from: G2 */
    byte[] mo27271G2() throws IOException;

    @C11395k(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @C11587t0(expression = "buffer", imports = {}))
    @C12579k
    /* renamed from: H */
    C12500m mo27272H();

    /* renamed from: J0 */
    long mo27273J0(@C12579k ByteString byteString) throws IOException;

    @C12579k
    /* renamed from: J1 */
    String mo27274J1() throws IOException;

    /* renamed from: J2 */
    boolean mo27275J2() throws IOException;

    /* renamed from: M3 */
    long mo27276M3(@C12579k C12506n0 n0Var) throws IOException;

    /* renamed from: N1 */
    boolean mo27277N1(long j, @C12579k ByteString byteString, int i, int i2) throws IOException;

    @C12579k
    /* renamed from: O1 */
    byte[] mo27278O1(long j) throws IOException;

    /* renamed from: O2 */
    long mo27279O2() throws IOException;

    /* renamed from: R1 */
    short mo27280R1() throws IOException;

    @C12579k
    /* renamed from: R3 */
    C12507o mo27281R3();

    /* renamed from: S0 */
    long mo27282S0(byte b, long j) throws IOException;

    /* renamed from: T0 */
    void mo27283T0(@C12579k C12500m mVar, long j) throws IOException;

    /* renamed from: U1 */
    long mo27284U1() throws IOException;

    /* renamed from: V0 */
    long mo27285V0(byte b, long j, long j2) throws IOException;

    /* renamed from: W0 */
    long mo27286W0(@C12579k ByteString byteString) throws IOException;

    @C12580l
    /* renamed from: X0 */
    String mo27287X0() throws IOException;

    /* renamed from: X3 */
    long mo27288X3() throws IOException;

    /* renamed from: Y3 */
    int mo27289Y3(@C12579k C12471f0 f0Var) throws IOException;

    @C12579k
    /* renamed from: b1 */
    String mo27290b1(long j) throws IOException;

    /* renamed from: d2 */
    long mo27291d2(@C12579k ByteString byteString, long j) throws IOException;

    @C12579k
    /* renamed from: e */
    C12500m mo27292e();

    /* renamed from: f2 */
    void mo27293f2(long j) throws IOException;

    @C12579k
    /* renamed from: h0 */
    InputStream mo27294h0();

    /* renamed from: i2 */
    long mo27295i2(byte b) throws IOException;

    @C12579k
    /* renamed from: i3 */
    String mo27296i3(@C12579k Charset charset) throws IOException;

    /* renamed from: l3 */
    int mo27298l3() throws IOException;

    /* renamed from: m0 */
    long mo27299m0(@C12579k ByteString byteString, long j) throws IOException;

    @C12579k
    /* renamed from: n2 */
    String mo27300n2(long j) throws IOException;

    @C12579k
    /* renamed from: n3 */
    ByteString mo27301n3() throws IOException;

    /* renamed from: o1 */
    boolean mo27302o1(long j, @C12579k ByteString byteString) throws IOException;

    int read(@C12579k byte[] bArr) throws IOException;

    int read(@C12579k byte[] bArr, int i, int i2) throws IOException;

    byte readByte() throws IOException;

    void readFully(@C12579k byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    void skip(long j) throws IOException;

    @C12579k
    /* renamed from: t2 */
    ByteString mo27312t2(long j) throws IOException;

    /* renamed from: y3 */
    int mo27314y3() throws IOException;
}
