package pojo;
// Generated Oct 9, 2022 3:40:14 PM by Hibernate Tools 4.3.1
import DAO.DAOAlbums;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.faces.bean.ManagedBean;

/**
 * Albums generated by hbm2java
 */
@ManagedBean
public class Albums  implements java.io.Serializable {


     private Integer idAlbum;
     private String albumName;
     private String artist;
     private String years;
     private String type;
     private Integer price;
     private Integer stock;
     private Set orderses = new HashSet(0);

    public Albums() {
    }
    
    public Albums(String albumName) {
        this.albumName = albumName;
    }
    public Albums(String albumName, String artist, String years, String type, Integer price, Integer stock, Set orderses) {
       this.albumName = albumName;
       this.artist = artist;
       this.years = years;
       this.type = type;
       this.price = price;
       this.stock = stock;
       this.orderses = orderses;
    }
   
    public Integer getIdAlbum() {
        return this.idAlbum;
    }
    
    public void setIdAlbum(Integer idAlbum) {
        this.idAlbum = idAlbum;
    }
    public String getAlbumName() {
        return this.albumName;
    }
    
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
    public String getArtist() {
        return this.artist;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getYears() {
        return this.years;
    }
    
    public void setYears(String years) {
        this.years = years;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Integer getPrice() {
        return this.price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getStock() {
        return this.stock;
    }
    
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Set getOrderses() {
        return this.orderses;
    }
    
    public void setOrderses(Set orderses) {
        this.orderses = orderses;
    }
    
    public void saveAlbum(){
        DAOAlbums album = new DAOAlbums();
        album.addAlbum(this);
    }
    
    public void deleteAlbum(){
        DAOAlbums album = new DAOAlbums();
        album.deleteAlbum(idAlbum.toString());
        albumName = "";
        artist = "";
        years = "";
        type = "";
        price = 0;
        stock = 0;
        idAlbum = 0;
    }
    
    public String getbyID(){
        DAOAlbums album = new DAOAlbums();
        List<Albums> lAlbum = album.getbyID(idAlbum.toString());
        albumName = lAlbum.get(0).albumName;
        artist = lAlbum.get(0).artist;
        years = lAlbum.get(0).years;
        type = lAlbum.get(0).type;
        price = lAlbum.get(0).price;
        stock = lAlbum.get(0).stock;
        return "edit_album";
    }
    
    public List<Albums> getAllRecords(){
        DAOAlbums album = new DAOAlbums();
        List<Albums> lAlbum = album.retrieveAlbums();
        return lAlbum;
    }
    
    public void updateAlbum(){
        DAOAlbums album = new DAOAlbums();
        album.updateAlbum(this);
        albumName = "";
        artist = "";
        years = "";
        type = "";
        price = 0;
        stock = 0;
        idAlbum = 0;
    }

}


