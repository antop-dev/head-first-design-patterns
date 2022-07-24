package chapter11.remoteproxy

import java.rmi.Remote
import java.rmi.RemoteException

interface GumballMachineRemote : Remote {
    @get:Throws(RemoteException::class)
    val count: Int

    @get:Throws(RemoteException::class)
    val location: String

    @get:Throws(RemoteException::class)
    val state: State
}
