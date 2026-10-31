package com.auction.model;
import java.time.LocalDateTime;

public class Auction extends Entity {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private AuctionStatus status;
    private BidTransaction highestBid;

    public Auction() {
        super();
    }

    public Auction(LocalDateTime startTime, LocalDateTime endTime, AuctionStatus status) {
        super();
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public AuctionStatus getStatus() {
        return status;
    }

    public void setStatus(AuctionStatus status) {
        this.status = status;
    }

    public boolean placeBid(Bidder bidder, double amount) {
        return false;
    }

    public void closeAuction() {
    }

    public BidTransaction getHighestBid() {
        return highestBid;
    }

    public void setHighestBid(BidTransaction highestBid) {
        this.highestBid = highestBid;
    }

    @Override
    public void printInfo() {
    }
}
