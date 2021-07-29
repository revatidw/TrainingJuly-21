export class Company{
    companyId: number| undefined;
    companyName: string| undefined;
    turnover: number| undefined;
    boardOfDirectors: string| undefined;
    stockExchangeId: any;
    sectorId: string| undefined;
    briefWriteup: string| undefined;
    ip: number|undefined;

    constructor( companyId: number,
        companyName: string,
        turnover: number,
        boardOfDirectors: string,
        stock: string,
        sectorId: string,
        briefWriteup: string,
        ip: number)
        {}
}