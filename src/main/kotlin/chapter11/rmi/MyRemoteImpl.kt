package chapter11.rmi

import java.rmi.RemoteException
import java.rmi.registry.LocateRegistry
import java.rmi.server.UnicastRemoteObject

class MyRemoteImpl : UnicastRemoteObject(), MyRemote {
    @Throws(RemoteException::class)
    override fun sayHello(): String {
        return "Server says, 'Hey'"
    }

}

fun main() {
    val registry = LocateRegistry.createRegistry(1099)
    registry.rebind("RemoteHello", MyRemoteImpl())
}
