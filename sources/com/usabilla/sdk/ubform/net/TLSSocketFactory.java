package com.usabilla.sdk.ubform.net;

import com.journeyapps.barcodescanner.camera.C34935s;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class TLSSocketFactory extends SSLSocketFactory {
    @C12579k

    /* renamed from: a */
    public final C11677z f26928a = C10864b0.m38748c(TLSSocketFactory$internalSSLSocketFactory$2.f26929f);

    /* renamed from: a */
    public final Socket mo20257a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.2"});
        }
        return socket;
    }

    /* renamed from: b */
    public final SSLSocketFactory mo20258b() {
        Object value = this.f26928a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-internalSSLSocketFactory>(...)");
        return (SSLSocketFactory) value;
    }

    @C12579k
    public Socket createSocket(@C12579k Socket socket, @C12579k String str, int i, boolean z) throws IOException, NullPointerException {
        Intrinsics.checkNotNullParameter(socket, C34935s.f84988a);
        Intrinsics.checkNotNullParameter(str, "host");
        Socket createSocket = mo20258b().createSocket(socket, str, i, z);
        Intrinsics.checkNotNullExpressionValue(createSocket, "internalSSLSocketFactory.createSocket(s, host, port, autoClose)");
        return mo20257a(createSocket);
    }

    @C12579k
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = mo20258b().getDefaultCipherSuites();
        Intrinsics.checkNotNullExpressionValue(defaultCipherSuites, "internalSSLSocketFactory.defaultCipherSuites");
        return defaultCipherSuites;
    }

    @C12579k
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = mo20258b().getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "internalSSLSocketFactory.supportedCipherSuites");
        return supportedCipherSuites;
    }

    @C12579k
    public Socket createSocket(@C12579k String str, int i) throws IOException, SecurityException, UnknownHostException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(str, "host");
        Socket createSocket = mo20258b().createSocket(str, i);
        Intrinsics.checkNotNullExpressionValue(createSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return mo20257a(createSocket);
    }

    @C12579k
    public Socket createSocket(@C12579k String str, int i, @C12579k InetAddress inetAddress, int i2) throws IOException, SecurityException, UnknownHostException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(str, "host");
        Intrinsics.checkNotNullParameter(inetAddress, "localHost");
        Socket createSocket = mo20258b().createSocket(str, i, inetAddress, i2);
        Intrinsics.checkNotNullExpressionValue(createSocket, "internalSSLSocketFactory.createSocket(host, port, localHost, localPort)");
        return mo20257a(createSocket);
    }

    @C12579k
    public Socket createSocket(@C12579k InetAddress inetAddress, int i) throws IOException, SecurityException, IllegalArgumentException, NullPointerException {
        Intrinsics.checkNotNullParameter(inetAddress, "host");
        Socket createSocket = mo20258b().createSocket(inetAddress, i);
        Intrinsics.checkNotNullExpressionValue(createSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return mo20257a(createSocket);
    }

    @C12579k
    public Socket createSocket(@C12579k InetAddress inetAddress, int i, @C12579k InetAddress inetAddress2, int i2) throws IOException, SecurityException, IllegalArgumentException, NullPointerException {
        Intrinsics.checkNotNullParameter(inetAddress, "address");
        Intrinsics.checkNotNullParameter(inetAddress2, "localAddress");
        Socket createSocket = mo20258b().createSocket(inetAddress, i, inetAddress2, i2);
        Intrinsics.checkNotNullExpressionValue(createSocket, "internalSSLSocketFactory.createSocket(address, port, localAddress, localPort)");
        return mo20257a(createSocket);
    }
}
