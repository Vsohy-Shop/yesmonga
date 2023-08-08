package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u0012J\u0006\u0010\u0013\u001a\u00020\u000eJ\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0017"}, mo22516d2 = {"Lokhttp3/Route;", "", "address", "Lokhttp3/Address;", "proxy", "Ljava/net/Proxy;", "socketAddress", "Ljava/net/InetSocketAddress;", "(Lokhttp3/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "()Lokhttp3/Address;", "()Ljava/net/Proxy;", "()Ljava/net/InetSocketAddress;", "-deprecated_address", "equals", "", "other", "hashCode", "", "-deprecated_proxy", "requiresTunnel", "-deprecated_socketAddress", "toString", "", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class Route {
    @C12579k
    private final Address address;
    @C12579k
    private final Proxy proxy;
    @C12579k
    private final InetSocketAddress socketAddress;

    public Route(@C12579k Address address2, @C12579k Proxy proxy2, @C12579k InetSocketAddress inetSocketAddress) {
        Intrinsics.checkNotNullParameter(address2, "address");
        Intrinsics.checkNotNullParameter(proxy2, "proxy");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "socketAddress");
        this.address = address2;
        this.proxy = proxy2;
        this.socketAddress = inetSocketAddress;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "address", imports = {}))
    @C11314h(name = "-deprecated_address")
    @C12579k
    /* renamed from: -deprecated_address  reason: not valid java name */
    public final Address m172719deprecated_address() {
        return this.address;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "proxy", imports = {}))
    @C11314h(name = "-deprecated_proxy")
    @C12579k
    /* renamed from: -deprecated_proxy  reason: not valid java name */
    public final Proxy m172720deprecated_proxy() {
        return this.proxy;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "socketAddress", imports = {}))
    @C11314h(name = "-deprecated_socketAddress")
    @C12579k
    /* renamed from: -deprecated_socketAddress  reason: not valid java name */
    public final InetSocketAddress m172721deprecated_socketAddress() {
        return this.socketAddress;
    }

    @C11314h(name = "address")
    @C12579k
    public final Address address() {
        return this.address;
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            return Intrinsics.areEqual((Object) route.address, (Object) this.address) && Intrinsics.areEqual((Object) route.proxy, (Object) this.proxy) && Intrinsics.areEqual((Object) route.socketAddress, (Object) this.socketAddress);
        }
    }

    public int hashCode() {
        return ((((527 + this.address.hashCode()) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    @C11314h(name = "proxy")
    @C12579k
    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        return this.address.sslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    @C11314h(name = "socketAddress")
    @C12579k
    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    @C12579k
    public String toString() {
        return "Route{" + this.socketAddress + C12361b.f30259j;
    }
}
