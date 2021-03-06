/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commonservice;

import com.healthmarketscience.rmiio.RemoteInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author AmrHesham
 */
public interface ServerService extends Remote {

    public User login(String phone, String password, ClientService clientService) throws RemoteException;

    public boolean register(User user) throws RemoteException;

    //chat session msh 3arfen da a asln we yalla chatbot kaman aha

    public void sendMessage(String message, ArrayList<User> phoneNumberList, String SenderPhoneNumber) throws RemoteException;

   public void sendFile(RemoteInputStream ristream,String phoneNumber,String fileExtension,User user) throws RemoteException;

    public boolean updateProfile(User user) throws RemoteException;

    public void updateMode(User user) throws RemoteException;

    public User addNewContact(User user ,String phoneNumber) throws RemoteException;

    public void showFriendsStatus() throws RemoteException;

    public void signout(User user) throws RemoteException;

    public boolean checkUserAvailability(String phoneNumber) throws RemoteException;

    public ArrayList<String> getIncomingRequests(User user) throws RemoteException;

    public ArrayList<User> getFriends(User user) throws RemoteException;

    public ArrayList<User> getOnlineFriends(User user) throws RemoteException;

    public ArrayList<User> getOfflineFriends(User user) throws RemoteException;

    public void saveChatSession(ArrayList<Message> msgs , File file) throws RemoteException;
}
