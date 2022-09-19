package edu.festu.ivankuznetsov.filmviewersample.network;
import java.util.List;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

   
public class Film {

   @SerializedName("externalId")
   ExternalId externalId;

   @SerializedName("logo")
   Logo logo;

   @SerializedName("poster")
   Poster poster;

   @SerializedName("backdrop")
   Backdrop backdrop;

   @SerializedName("rating")
   Rating rating;

   @SerializedName("votes")
   Votes votes;

   @SerializedName("videos")
   Videos videos;

   @SerializedName("budget")
   Budget budget;

   @SerializedName("fees")
   Fees fees;

   @SerializedName("distributors")
   Distributors distributors;

   @SerializedName("premiere")
   Premiere premiere;

   @SerializedName("images")
   Images images;

   @SerializedName("collections")
   List<String> collections;

   @SerializedName("updateDates")
   List<String> updateDates;

   @SerializedName("status")
   String status;

   @SerializedName("movieLength")
   int movieLength;

   @SerializedName("productionCompanies")
   List<ProductionCompanies> productionCompanies;

   @SerializedName("spokenLanguages")
   List<SpokenLanguages> spokenLanguages;

   @SerializedName("id")
   int id;

   @SerializedName("type")
   String type;

   @SerializedName("name")
   String name;

   @SerializedName("description")
   String description;

   @SerializedName("slogan")
   String slogan;

   @SerializedName("year")
   int year;

   @SerializedName("facts")
   List<Facts> facts;

   @SerializedName("genres")
   List<Genres> genres;

   @SerializedName("countries")
   List<Countries> countries;

   @SerializedName("seasonsInfo")
   List<String> seasonsInfo;

   @SerializedName("persons")
   List<Persons> persons;

   @SerializedName("lists")
   List<String> lists;

   @SerializedName("typeNumber")
   int typeNumber;

   @SerializedName("alternativeName")
   String alternativeName;

   @SerializedName("enName")
   String enName;

   @SerializedName("names")
   List<Names> names;

   @SerializedName("updatedAt")
   Date updatedAt;

   @SerializedName("ratingMpaa")
   String ratingMpaa;

   @SerializedName("shortDescription")
   String shortDescription;

   @SerializedName("technology")
   Technology technology;

   @SerializedName("ticketsOnSale")
   boolean ticketsOnSale;

   @SerializedName("sequelsAndPrequels")
   List<SequelsAndPrequels> sequelsAndPrequels;

   @SerializedName("similarMovies")
   List<SimilarMovies> similarMovies;

   @SerializedName("imagesInfo")
   ImagesInfo imagesInfo;

   @SerializedName("ageRating")
   String ageRating;

   @SerializedName("watchability")
   Watchability watchability;

   @SerializedName("createDate")
   Date createDate;


    public void setExternalId(ExternalId externalId) {
        this.externalId = externalId;
    }
    public ExternalId getExternalId() {
        return externalId;
    }
    
    public void setLogo(Logo logo) {
        this.logo = logo;
    }
    public Logo getLogo() {
        return logo;
    }
    
    public void setPoster(Poster poster) {
        this.poster = poster;
    }
    public Poster getPoster() {
        return poster;
    }
    
    public void setBackdrop(Backdrop backdrop) {
        this.backdrop = backdrop;
    }
    public Backdrop getBackdrop() {
        return backdrop;
    }
    
    public void setRating(Rating rating) {
        this.rating = rating;
    }
    public Rating getRating() {
        return rating;
    }
    
    public void setVotes(Votes votes) {
        this.votes = votes;
    }
    public Votes getVotes() {
        return votes;
    }
    
    public void setVideos(Videos videos) {
        this.videos = videos;
    }
    public Videos getVideos() {
        return videos;
    }
    
    public void setBudget(Budget budget) {
        this.budget = budget;
    }
    public Budget getBudget() {
        return budget;
    }
    
    public void setFees(Fees fees) {
        this.fees = fees;
    }
    public Fees getFees() {
        return fees;
    }
    
    public void setDistributors(Distributors distributors) {
        this.distributors = distributors;
    }
    public Distributors getDistributors() {
        return distributors;
    }
    
    public void setPremiere(Premiere premiere) {
        this.premiere = premiere;
    }
    public Premiere getPremiere() {
        return premiere;
    }
    
    public void setImages(Images images) {
        this.images = images;
    }
    public Images getImages() {
        return images;
    }
    
    public void setCollections(List<String> collections) {
        this.collections = collections;
    }
    public List<String> getCollections() {
        return collections;
    }
    
    public void setUpdateDates(List<String> updateDates) {
        this.updateDates = updateDates;
    }
    public List<String> getUpdateDates() {
        return updateDates;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    
    public void setMovieLength(int movieLength) {
        this.movieLength = movieLength;
    }
    public int getMovieLength() {
        return movieLength;
    }
    
    public void setProductionCompanies(List<ProductionCompanies> productionCompanies) {
        this.productionCompanies = productionCompanies;
    }
    public List<ProductionCompanies> getProductionCompanies() {
        return productionCompanies;
    }
    
    public void setSpokenLanguages(List<SpokenLanguages> spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }
    public List<SpokenLanguages> getSpokenLanguages() {
        return spokenLanguages;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }
    public String getSlogan() {
        return slogan;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    
    public void setFacts(List<Facts> facts) {
        this.facts = facts;
    }
    public List<Facts> getFacts() {
        return facts;
    }
    
    public void setGenres(List<Genres> genres) {
        this.genres = genres;
    }
    public List<Genres> getGenres() {
        return genres;
    }
    
    public void setCountries(List<Countries> countries) {
        this.countries = countries;
    }
    public List<Countries> getCountries() {
        return countries;
    }
    
    public void setSeasonsInfo(List<String> seasonsInfo) {
        this.seasonsInfo = seasonsInfo;
    }
    public List<String> getSeasonsInfo() {
        return seasonsInfo;
    }
    
    public void setPersons(List<Persons> persons) {
        this.persons = persons;
    }
    public List<Persons> getPersons() {
        return persons;
    }
    
    public void setLists(List<String> lists) {
        this.lists = lists;
    }
    public List<String> getLists() {
        return lists;
    }
    
    public void setTypeNumber(int typeNumber) {
        this.typeNumber = typeNumber;
    }
    public int getTypeNumber() {
        return typeNumber;
    }
    
    public void setAlternativeName(String alternativeName) {
        this.alternativeName = alternativeName;
    }
    public String getAlternativeName() {
        return alternativeName;
    }
    
    public void setEnName(String enName) {
        this.enName = enName;
    }
    public String getEnName() {
        return enName;
    }
    
    public void setNames(List<Names> names) {
        this.names = names;
    }
    public List<Names> getNames() {
        return names;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    
    public void setRatingMpaa(String ratingMpaa) {
        this.ratingMpaa = ratingMpaa;
    }
    public String getRatingMpaa() {
        return ratingMpaa;
    }
    
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    public String getShortDescription() {
        return shortDescription;
    }
    
    public void setTechnology(Technology technology) {
        this.technology = technology;
    }
    public Technology getTechnology() {
        return technology;
    }
    
    public void setTicketsOnSale(boolean ticketsOnSale) {
        this.ticketsOnSale = ticketsOnSale;
    }
    public boolean getTicketsOnSale() {
        return ticketsOnSale;
    }
    
    public void setSequelsAndPrequels(List<SequelsAndPrequels> sequelsAndPrequels) {
        this.sequelsAndPrequels = sequelsAndPrequels;
    }
    public List<SequelsAndPrequels> getSequelsAndPrequels() {
        return sequelsAndPrequels;
    }
    
    public void setSimilarMovies(List<SimilarMovies> similarMovies) {
        this.similarMovies = similarMovies;
    }
    public List<SimilarMovies> getSimilarMovies() {
        return similarMovies;
    }
    
    public void setImagesInfo(ImagesInfo imagesInfo) {
        this.imagesInfo = imagesInfo;
    }
    public ImagesInfo getImagesInfo() {
        return imagesInfo;
    }
    
    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }
    public String getAgeRating() {
        return ageRating;
    }
    
    public void setWatchability(Watchability watchability) {
        this.watchability = watchability;
    }
    public Watchability getWatchability() {
        return watchability;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public Date getCreateDate() {
        return createDate;
    }
    
}