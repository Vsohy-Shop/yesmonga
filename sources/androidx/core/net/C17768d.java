package androidx.core.net;

import android.net.TrafficStats;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

/* renamed from: androidx.core.net.d */
public final class C17768d {

    @C0376v0(24)
    /* renamed from: androidx.core.net.d$a */
    public static class C17769a {
        @C0373u
        /* renamed from: a */
        public static void m81139a(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.tagDatagramSocket(datagramSocket);
        }

        @C0373u
        /* renamed from: b */
        public static void m81140b(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.untagDatagramSocket(datagramSocket);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m81130a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    /* renamed from: b */
    public static int m81131b() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    /* renamed from: c */
    public static void m81132c(int i) {
        TrafficStats.incrementOperationCount(i);
    }

    @Deprecated
    /* renamed from: d */
    public static void m81133d(int i, int i2) {
        TrafficStats.incrementOperationCount(i, i2);
    }

    @Deprecated
    /* renamed from: e */
    public static void m81134e(int i) {
        TrafficStats.setThreadStatsTag(i);
    }

    /* renamed from: f */
    public static void m81135f(@C0359n0 DatagramSocket datagramSocket) throws SocketException {
        C17769a.m81139a(datagramSocket);
    }

    @Deprecated
    /* renamed from: g */
    public static void m81136g(Socket socket) throws SocketException {
        TrafficStats.tagSocket(socket);
    }

    /* renamed from: h */
    public static void m81137h(@C0359n0 DatagramSocket datagramSocket) throws SocketException {
        C17769a.m81140b(datagramSocket);
    }

    @Deprecated
    /* renamed from: i */
    public static void m81138i(Socket socket) throws SocketException {
        TrafficStats.untagSocket(socket);
    }
}
