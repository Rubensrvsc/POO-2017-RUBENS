package model;

public class Post {
	int countLikes;
	public Post(int initialLikes){
		countLikes=initialLikes;
	}
	public void addLike(){
		countLikes++;
	}

}
