/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor3;

/**
 *
 * @author Hp
 */
class User {
    private int u_id;
    //private String name;
    private String complaint;
    private String Status_c;
    public User(int ID,String Complaint,String Status_of_Complaint){
        this.u_id=u_id;
        //this.name=name; String Name,
        this.complaint=complaint;
        this.Status_c=Status_c;
    }
    public int getu_id(){
        return u_id ;
    }
    //public String getname(){
    //    return name;
    //}
    public String getcomplaint(){
        return complaint;
    }
    public String getStatus_c(){
        return Status_c;
    }
    
}
