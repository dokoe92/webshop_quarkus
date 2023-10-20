
    alter table if exists app_user 
       drop constraint if exists FK9vluc0o0i5ajm92e2ynvx2afw;

    alter table if exists Item 
       drop constraint if exists FKojb25qw2wfd40b4oc9e6xleef;

    drop table if exists app_user cascade;

    drop table if exists Item cascade;

    drop table if exists MyEntity cascade;

    drop table if exists ShoppingCart cascade;

    drop sequence if exists app_user_SEQ;

    drop sequence if exists Item_SEQ;

    drop sequence if exists MyEntity_SEQ;

    drop sequence if exists ShoppingCart_SEQ;
